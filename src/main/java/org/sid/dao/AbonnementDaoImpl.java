package org.sid.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.sid.entities.Abonnement;

public class AbonnementDaoImpl implements IAbonnementDAO {
	@PersistenceContext
	private EntityManager em;

	public void addAbonnement(Abonnement abonnement) {
		em.persist(abonnement);

	}

	public List<Abonnement> listAbonnement(boolean actif) {
		Query req;
		req = em.createQuery("select a from Abonnement a where a.actif=true");
		return req.getResultList();
	}

	public List<Abonnement> listAbonnementByDate(Date d1, Date d2) {
		Query req;
		req = em.createQuery("select a from Abonnement a where a.dateAbonnement beetwen :d1 & :d2");
		req.setParameter("d1", d1);
		req.setParameter("d2", d2);
		return req.getResultList();
	}

	public Abonnement getabonnement(long idAb) {
		// TODO Auto-generated method stub
		return em.find(Abonnement.class, idAb);
	}

	public void upadatAbonnement(Abonnement abonnement) {
		em.merge(abonnement);

	}

	public void deleteAbonnement(Long idAb) {
		em.remove(em.find(Abonnement.class, idAb));

	}

	public void consomer(long idAb, double mt) {
	Abonnement ab=new Abonnement();
	ab=em.find(Abonnement.class, idAb);
	ab.setSolde(ab.getSolde()-mt);
	em.persist(ab);
		
	}

}
