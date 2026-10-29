package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateOneToOne {

    public static void main(String[] args) {

    	Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
            try {
                Passport passport =new Passport("IND123458");
                passport.setId(103);

                Person person =new Person("SaiRam", passport);
                person.setId(3);
                session.persist(person);
                session.persist(passport);

                tx.commit();

                System.out.println("Person saved successfully!");
                System.out.println("Person ID: " + person.getId());
                System.out.println("Passport Number: " +person.getPassport().getPassportNo()
                );
        }
        catch(Exception e) {
        	e.printStackTrace();      
        	}
    }
}