package ru.gb.java_core1.l5_Homework;

import java.math.BigDecimal;

public class Employee {
    String fullName;
    String post;
    String eMail;
    String phoneNumber;
    BigDecimal salary;
    int age;

    public Employee(String fullName, String post, String eMail, String phoneNumber, BigDecimal salary, int age ){
        this.fullName = fullName;
        this.post = post;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getEmployersInformation(){
        System.out.printf("Full name: %s\nPost: %s\nEMail: %s\nPhone number: %s\nAge: %d\nSalary: "+ salary.toString() +"\n",
                fullName, post,eMail,phoneNumber, age);
    }
}
