package ru.gb.java_core2.l1_Homework;

public class Treadmill extends Obstacles{

    public Treadmill(int length) {
        super(length);
    }

    public int getLength() {
        return super.getHeightOrLength();
    }
}
