package com.crmindz.Hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.crmindz.Hibernate.model.Address;
import com.crmindz.Hibernate.model.Registration;
import com.crmindz.Hibernate.util.HibernateUtil;

public class HibernateOneToOneMain {

	public static void main(String[] args) {

		Registration r = new Registration();
		r.setFirstName("Puneeth");
		r.setLastName("Akkanti");
		r.setEmail("puneeth8045");
		r.setPhnNo("407-782-4633");

		Address address = new Address();
		address.setAddressLine1("12334455");
		address.setAddressLine2("12345654321");
		address.setCity("Irving");
		address.setState("Texas");
		address.setZipCode("75063");
		address.setId(r.getId());

		r.setAddress(address);
		address.setRegistration(r);

		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;

		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			System.out.println("Session Created");
			System.out.println("Transaction Id = " + r.getFirstName());
			tx = session.beginTransaction();
			session.save(r);
			tx.commit();

			System.out.println("Transaction Id = " + r.getId());

		} catch (Exception e) {
			System.out.println("Exception" + e.getMessage());
			e.printStackTrace();
		} finally {
			if (!sessionFactory.isClosed()) {
				sessionFactory.close();
			}
		}

	}

	
}
