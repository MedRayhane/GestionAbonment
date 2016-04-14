package org.sid.service;

import java.util.Date;
import java.util.List;

import org.sid.entities.Abonnement;

public interface IAbonnementService {
	public void addAbonnement(Abonnement abonnement);
	public List<Abonnement> listAbonnement(boolean actif);
	public List<Abonnement> listAbonnementByDate(Date d1, Date d2);
	public Abonnement getabonnement(long idAb);
	public void upadatAbonnement(Abonnement abonnement);
	public void deleteAbonnement(Long idAb);
	public void consomer(long idAb, double mt);

}
