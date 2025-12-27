package com.hibernate.crud;


import org.hibernate.Session;
import com.hibernate.demo.entity.Student;
import com.hibernate.demo.util.HibernateUtil;

public class GetStudent {
        public static void main(String[] args) {
                try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                        // get() - hits DB immediately; null if not found
                        Student student1 = session.get(Student.class, 1);
                        System.out.println(student1 != null ? student1 : "Student id=1 not found");

                        // use get() instead of load() to avoid ObjectNotFoundException when row is missing
                        Student student2 = session.get(Student.class, 2);
                        System.out.println(student2 != null ? student2.getName() : "Student id=2 not found");
                }
        }
}
