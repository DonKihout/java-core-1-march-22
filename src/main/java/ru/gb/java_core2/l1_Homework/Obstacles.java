package ru.gb.java_core2.l1_Homework;

public abstract class Obstacles {
    private int heightOrLength;

    public Obstacles(int heightOrLength) {
        this.heightOrLength = heightOrLength;
    }

    public int getHeightOrLength() {
        return heightOrLength;
    }
}
