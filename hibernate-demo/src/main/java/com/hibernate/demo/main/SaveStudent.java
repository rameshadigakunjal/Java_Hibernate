package com.hibernate.demo.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.demo.entity.Student;
import com.hibernate.demo.util.HibernateUtil;

public class SaveStudent {

    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            // add as many students as you like here
            Student s1 = new Student("Alice", 20, "alice@example.com");
            Student s2 = new Student("Bob", 21, "bob@example.com");
            Student s3 = new Student("Charlie", 22, "charlie@example.com");

            session.save(s1);
            session.save(s2);
            session.save(s3);

            tx.commit();
            System.out.println("Students saved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
