package ru.gb.java_core1.l7_Homework;

public class Cat {
    private String name;
    private int appetite;
    private boolean satisfied;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eatFood(Bowl bowl){
        if(bowl.isFoodEnough(this.appetite)){
            satisfied = true;
            System.out.printf("The cat %s has eaten and he is happy!!!\n", this.name);
        } else{
            System.out.printf("Food in bowl is not enough for %s\n", this.name);
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satisfied=" + satisfied +
                '}';
    }
}
