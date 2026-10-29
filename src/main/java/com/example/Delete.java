package com.example;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import org.hibernate.Transaction;

public class Delete {
    public static void main(String[] args) {

        Configuration cfg = new Configuration()
                .configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            // Fetch the existing student with ID 4
            Student s = session.get(Student.class, 3);

            if (s != null) {
                // Delete the student
                session.remove(s);

                tx.commit();
                System.out.println("Values Are Deleted");
            } else {
                tx.rollback();
                System.out.println("Student Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}