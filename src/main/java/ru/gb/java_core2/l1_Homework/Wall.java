package ru.gb.java_core2.l1_Homework;

public class Wall extends Obstacles {

    public Wall(int height) {
        super(height);
    }

    public int getHeight() {
        return super.getHeightOrLength();
    }
}
