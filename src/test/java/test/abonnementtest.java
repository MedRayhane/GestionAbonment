package test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.sid.entities.Abonnement;
import org.sid.entities.AbonnementGSM;
import org.sid.entities.AbonnementInternet;
import org.sid.service.IAbonnementService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class abonnementtest {
	IAbonnementService metier;

	@Before
	public void setUp() throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });// apppel au sring
															// pour avoir le
															// bean metier
		metier = (IAbonnementService) context.getBean("metier");
	}

	@Test
	public void test() {
//metier.addAbonnement(new Abonnement(new Date(), 400, true));
		//metier.addAbonnement(new AbonnementGSM(new Date(), 300, true, 400));
		//metier.addAbonnement(new AbonnementInternet(new Date(), 987, true, 452));

		
		 // List<Abonnement> abs= metier.listAbonnement(true);
		  metier.addAbonnement(new AbonnementGSM(new Date(), 300, true, 400));
		  metier.addAbonnement(new AbonnementInternet(new Date(), 987, true,
		  452)); 
		  List<Abonnement> abs2= metier.listAbonnement(true);
		 // assertTrue(abs.size()+2==abs2.size());
		 
	}

}
