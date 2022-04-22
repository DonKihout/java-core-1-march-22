package ru.gb.java_core2.l1_Homework;

public class Human implements OlympicGames{
    private String country;
    private int jumpPossibility;
    private int runPossibility;

    public Human(String country, int jumpPossibility, int runPossibility) {
        this.country = country;
        this.jumpPossibility = jumpPossibility;
        this.runPossibility = runPossibility;
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if(runPossibility > treadmill.getLength()){
            System.out.println("participant from " + this.country + " run for " + treadmill.getLength() + " meters");
            return true;
        }else{
            System.out.println("participant from " + this.country + " couldn't run for " + treadmill.getLength() + " meters and lose");
        }
        return false;
    }

    @Override
    public boolean jump(Wall wall) {
        if(jumpPossibility > wall.getHeight()){
            System.out.println("participant from " + this.country + " jumped over a wall " + wall.getHeight() + " meters high and runs on");
            return true;
        }else{
            System.out.println("participant from " + this.country + " couldn't jump over a wall " + wall.getHeight() + " meters high and lose");
        }
        return false;
    }
}
