package com.sssm.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sssm.model.Athlete;

public class App {

	public static void main(String[] args) {

		// create and insert an Athlete
		Athlete ath1 = new Athlete();
		int id = 4;
		ath1.setId(id);
		ath1.setFirstName("M" + id);
		ath1.setLastName("S" + id);
		ath1.setDoNotStore("++++ do not store ++++");

		// step 1 - create configuration
		// if .configure() is not set, it throws -> Access to DialectResolutionInfo cannot be null when 'hibernate.dialect' not set
		// by default .configure() checks for file with name hibernate.cfg.xml
		// if .addAnnotatedClass(...) is not set, it throws -> org.hibernate.MappingException: Unknown entity: com.sssm.model.Athlete
		Configuration config = new Configuration().configure().addAnnotatedClass(Athlete.class);
		// step 2 - create session factory
		SessionFactory sf = config.buildSessionFactory();
		// step 3 - create session
		Session session = sf.openSession();
		// step 4 - create transaction
		Transaction tx1 = session.beginTransaction();
		// step 5 - save object
		session.save(ath1);
		// step 6 - commit transaction
		tx1.commit();
		
		// retrieve Athlete
		ath1 = session.get(Athlete.class, 6);
		System.out.println(ath1);
	}

}
