package ru.gb.java_core2.l3_Homework;

import java.util.HashMap;

public class PhoneBookCheck {
    public static void main(String[] args) {
        TelephoneDirectory phoneBook = new TelephoneDirectory(new HashMap<>());
        phoneBook.add("Pupkin", "1234");
        phoneBook.add("Popkin", "1233");
        phoneBook.add("Pupkin", "1235");
        phoneBook.add("Popkin", "1236");
        phoneBook.add("Popkin", "1237");
        phoneBook.get("Popkin");
    }
}
