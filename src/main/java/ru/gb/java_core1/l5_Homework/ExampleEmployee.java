package ru.gb.java_core1.l5_Homework;

import java.math.BigDecimal;
import java.util.Random;

public class ExampleEmployee {
    public static Random random = new Random();
    public static void main(String[] args) {
        Employee employee = new Employee("Vadim Ganiuta", "Java-programmer", "exampleEMail@yandex.ru",
                "89064756483", new BigDecimal("250000.00"), 21);
        employee.getEmployersInformation();
        getInformationOfEmployersOlder40(createArrayOfEmployers(random));

    }

    public static Employee[] createArrayOfEmployers(Random random) {
        Employee[] persArray = new Employee[5];
        for (int i = 0; i < persArray.length; i++) {
            String eMail = "exampleEMail" + i + "@yandex.ru";
            String phoneNumber = "8906475648" + i;
            Integer salary =  250000 - i * 20000;
            persArray[i] = new Employee("Employee" + i, "Java-programmer", eMail, phoneNumber,
                    new BigDecimal(salary.toString()), random.nextInt(30) + 30);
        }
        return persArray;
    }

    public static void getInformationOfEmployersOlder40(Employee[] persArray) {
        for (int i = 0; i < persArray.length ; i++) {
            if(persArray[i].age > 40) {
                System.out.println();
                persArray[i].getEmployersInformation();
            }
        }
    }

}
