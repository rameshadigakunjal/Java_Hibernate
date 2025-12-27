package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.demo.entity.Student;
import com.hibernate.demo.util.HibernateUtil;

public class UpdateDetachedStudent {
    public static void main(String[] args) {
         Session session1 = HibernateUtil
                .getSessionFactory()
                .openSession();

        Student student = session1.get(Student.class, 1);
        session1.close(); // DETACHED

        student.setAge(28);

        Session session2 = HibernateUtil
                .getSessionFactory()
                .openSession();
        Transaction tx = session2.beginTransaction();

        session2.merge(student); // OR update(student)

        tx.commit();
        session2.close();

        System.out.println("Detached student updated!");
    }
}
