package org.sid.web;

import java.util.Date;
import java.util.List;

import org.sid.entities.Abonnement;
import org.sid.entities.AbonnementGSM;
import org.sid.entities.AbonnementInternet;
import org.sid.service.IAbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.opensymphony.xwork2.ActionSupport;

@Component
// si on utulise autwred on utulise cette anotation comme si un composant du
// spring
public class AbonnementAction extends ActionSupport {
	@Autowired
	public IAbonnementService service;
	public long idAbonnement;
	public Date dateAbonnement;
	public double solde;
	public boolean actif;
	public String type;
	public int fidleo;
	public int debit;
	public String[] typeAB = new String[] { "", "GSM", "INT" };
	public List<Abonnement> abs;

	public String index() {

		abs = service.listAbonnement(true);
		return "succee";
	}

	public String getSubForm() {

		return "succee";
	}

	public String save() throws Exception {
		System.out.println("call methode SAVE ");
		Abonnement ab;
		if (type.equals("GSM"))

			ab = new AbonnementGSM(dateAbonnement, solde, actif, fidleo);
		else

			ab = new AbonnementInternet(dateAbonnement, solde, actif, debit);

		service.addAbonnement(ab);
		System.out.println("add se fait avec sucee ");
		abs = service.listAbonnement(true);
		return "succee";
	}

	public String safty() {
		System.out.println("call methode SAVE date est "+dateAbonnement);
		return "succee";
	}

}
