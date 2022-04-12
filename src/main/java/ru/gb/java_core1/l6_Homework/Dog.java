package ru.gb.java_core1.l6_Homework;

public class Dog extends Animal{
    private int runDistance;
    private int swimDistance;
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;
    private static int count;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int runDistance){
        this.runDistance = runDistance;
        if(this.runDistance > maxRunDistance){
            System.out.printf("Dog %s cant run for %d m\n", name, this.runDistance);
        } else{
            System.out.printf("Dog %s run for %d m\n", name, this.runDistance);
        }
    }

    @Override
    public void swim(int swimDistance){
        this.swimDistance = swimDistance;
        if(this.swimDistance > maxSwimDistance){
            System.out.printf("Dog %s cant swim for %d m\n", name, this.swimDistance);
        } else{
            System.out.printf("Dog %s swim for %d m\n", name, this.swimDistance);
        }
    }

    public static int getCount(){
        return count;
    }
}
