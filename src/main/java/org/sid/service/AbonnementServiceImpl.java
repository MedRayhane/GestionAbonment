package org.sid.service;

import java.util.Date;
import java.util.List;

import org.sid.dao.IAbonnementDAO;
import org.sid.entities.Abonnement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AbonnementServiceImpl implements IAbonnementService {
	@Autowired
	IAbonnementDAO dao;

	public void setDao(IAbonnementDAO dao) {
		this.dao = dao;
	}

	public void addAbonnement(Abonnement abonnement) {
		dao.addAbonnement(abonnement);

	}

	public List<Abonnement> listAbonnement(boolean actif) {
		// TODO Auto-generated method stub
		return dao.listAbonnement(actif);
	}

	public List<Abonnement> listAbonnementByDate(Date d1, Date d2) {
		// TODO Auto-generated method stub
		return dao.listAbonnementByDate(d1, d2);
	}

	public Abonnement getabonnement(long idAb) {
		// TODO Auto-generated method stub
		return dao.getabonnement(idAb);
	}

	public void upadatAbonnement(Abonnement abonnement) {
		dao.upadatAbonnement(abonnement);

	}

	public void deleteAbonnement(Long idAb) {
		dao.deleteAbonnement(idAb);

	}

	public void consomer(long idAb, double mt) {
		dao.consomer(idAb, mt);

	}

}
