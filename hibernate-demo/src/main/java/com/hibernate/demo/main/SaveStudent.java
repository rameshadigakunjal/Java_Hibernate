package com.hibernate.demo.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.demo.entity.Student;
import com.hibernate.demo.util.HibernateUtil;

public class SaveStudent {

    public static void main(String[] args) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx = session.beginTransaction();

        Student student = new Student("NameOfStudent", 20, "StudentEmail@example.com");
        session.save(student);

        tx.commit();
        session.close();

        System.out.println("Student saved successfully!");
    }
}
