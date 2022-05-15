package ru.gb.java_core2.l3_Homework;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = new String[] {
                "Geek", "Brains", "Java", "City",
                "Language", "Brains", "Java", "City",
                "Moscow", "Brain", "JavaCore", "City",
                "Sea", "Ocean", "Road", "Cars",
        };
        unrepeatableWords(words);
    }
    public static void unrepeatableWords(String[] words){
        if(words.length == 0){
            throw new NullPointerException("The array is empty!");
        }
        Map<String, Long> wordsCount = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(),
                                                                                        Collectors.counting()));
        Set<String> unique = new HashSet<>(Arrays.asList(words));
        System.out.println("All words count: " + words.length);
        System.out.println("Each word count: " + wordsCount);
        System.out.println("Unique words: " + unique + " count: " + unique.size());

    }
}
