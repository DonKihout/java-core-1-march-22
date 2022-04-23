package ru.gb.java_core1.l7_Homework;

public class Bowl {
    private int foodAmount;

    public void putFood(int foodAmount){
        this.foodAmount += foodAmount;
        System.out.printf("Food amount in bowl: %d\n", foodAmount);
    }
    public boolean isFoodEnough(int catAppetite){
        if(catAppetite > foodAmount){
            return false;
        } else{
            this.foodAmount -= catAppetite;
            return true;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
