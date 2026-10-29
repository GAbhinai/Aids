package com.example;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import org.hibernate.Transaction;

public class Update {
    public static void main(String[] args) {

        Configuration cfg = new Configuration()
                .configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            // Fetch the existing student
            Student s = session.get(Student.class, 4);

            if (s != null) {
                // Update values
                s.setName("Sai Kumar");
                s.setAge(10);

                tx.commit();
                System.out.println("Values Are Updated");
            } else {
                tx.rollback();
                System.out.println("Student Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}