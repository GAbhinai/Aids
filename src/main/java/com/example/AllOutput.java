package com.example;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.*;
public class AllOutput {
	public static void main(String[] args) {
		Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		try {
			   List<Student> students = session.createQuery("FROM Student", Student.class).list();
	            for (Student student : students) {
	                System.out.println(
	                        student.getAge() + " "
	                        + student.getId() + " "
	                        + student.getName()
	                );
	            }		
		tx.commit();
		System.out.println("Values Are Inserted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}


