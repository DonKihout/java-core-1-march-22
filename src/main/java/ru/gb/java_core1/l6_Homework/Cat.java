package ru.gb.java_core1.l6_Homework;

public class Cat extends Animal {
    private int runDistance;
    private int swimDistance;
    private final int maxRunDistance = 200;
    private static int count;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int runDistance){
        this.runDistance = runDistance;
        if(this.runDistance > maxRunDistance){
            System.out.printf("Cat %s cant run for %d m\n", name, this.runDistance);
        } else{
            System.out.printf("Cat %s run for %d m\n",name, this.runDistance);
        }
    }

    @Override
    public void swim(int swimDistance){
        this.swimDistance = swimDistance;
        System.out.printf("Cat %s cant swim for %d m\n",name, this.swimDistance);
    }

    public static int getCount(){
        return count;
    }
}
