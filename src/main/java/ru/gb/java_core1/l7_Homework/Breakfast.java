package ru.gb.java_core1.l7_Homework;

public class Breakfast {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
              new Cat("Lucy", 5),
              new Cat("Cherny", 15),
              new Cat("Barsik", 13),
              new Cat("Ciry", 28)
        };
        Bowl bowl = new Bowl();
        bowl.putFood(35);
        for (Cat cat : cats) {
            cat.eatFood(bowl);
        }
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("Food amount in bowl: " + bowl.getFoodAmount());
    }
}
