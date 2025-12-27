package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.demo.entity.Student;
import com.hibernate.demo.util.HibernateUtil;
public class DeleteStudent {
    public static void main(String[] args) {
         Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx = session.beginTransaction();

        Student student = session.get(Student.class, 3);
        session.delete(student);

        tx.commit();
        session.close();

        System.out.println("Student deleted!");
    }
}
