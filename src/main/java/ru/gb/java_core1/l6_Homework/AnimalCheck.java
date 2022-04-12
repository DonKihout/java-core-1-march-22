package ru.gb.java_core1.l6_Homework;

public class AnimalCheck {
    public static void main(String[] args) {
        Cat cat = new Cat("Lucy");
        Dog dog = new Dog("Mukhtar");
        Dog dog2 = new Dog("Bobik");
        cat.run(100);
        cat.swim(10);
        dog.run(200);
        dog.swim(5);
        dog2.run(300);
        dog2.swim(10);
        System.out.println("Animal born: " + Animal.getCount());
        System.out.println("Cats born: " + Cat.getCount());
        System.out.println("Dogs born: " + Dog.getCount());
    }
}
