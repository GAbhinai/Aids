package com.example;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
public class Hibernateinsert {
	public static void main(String[] args) {
		Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Student s=new Student("Sai",3,40);
		try {
		session.persist(s);
		tx.commit();
		System.out.println("Values Are Inserted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
