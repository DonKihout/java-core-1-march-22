package ru.gb.java_core1.l6_Homework;

public class Animal {
    protected String name;
    protected int runDistance;
    protected int swimDistance;
    private static int count;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal born!!!");
        count++;
    }

    public void run(int runDistance){
        this.runDistance = runDistance;
        System.out.printf("Animal run for %d m", runDistance);
    }

    public void swim(int swimDistance){
        this.swimDistance = swimDistance;
        System.out.printf("Animal swim for %d m", swimDistance);
    }

    public static int getCount(){
        return count;
    }
}
