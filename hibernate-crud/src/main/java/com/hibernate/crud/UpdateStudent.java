package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.demo.entity.Student;
import com.hibernate.demo.util.HibernateUtil;
public class UpdateStudent {
    public static void main(String[] args) {
        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx = session.beginTransaction();

        Student student = session.get(Student.class, 1);
        student.setAge(26);  // automatic update

        tx.commit();
        session.close();

        System.out.println("Student updated!");
    }
}
