//DAY-1 To DAY-2

/*package com.hibernate.demo.entity;
import javax.persistence.*;


@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

*/

//Update Student Entity   DAY-3


package com.hibernate.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "student_details")   // custom table name
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")   // custom column name
    private int id;

    @Column(name = "student_name", length = 50, nullable = false)
    private String name;

    @Column(name = "student_age")
    private int age;

    @Column(name = "email", unique = true)
    private String email;

    @Transient   // will NOT be stored in DB
    private String tempNote;

    public Student() {}

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // getters & setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTempNote() {
        return tempNote;
    }

    public void setTempNote(String tempNote) {
        this.tempNote = tempNote;
    }
}