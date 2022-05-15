package ru.gb.java_core2.l3_Homework;

import java.util.Collection;
import java.util.HashMap;

public class TelephoneDirectory {
    private HashMap<String, String> phoneBook;
    private Collection <String> keyCollection;

    public TelephoneDirectory(HashMap<String, String> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void add(String surname, String phoneNumber) {
        this.phoneBook.put(phoneNumber, surname);
        this.keyCollection = this.phoneBook.keySet();
    }

    public void get(String surname) {
        for (String key: this.keyCollection) {
            if(this.phoneBook.get(key) == surname) System.out.println(surname + " " + key);
        }
    }

}
