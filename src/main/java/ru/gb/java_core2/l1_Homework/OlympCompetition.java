package ru.gb.java_core2.l1_Homework;

public class OlympCompetition {
    public static void main(String[] args) {
        OlympicGames[] participant = {
                new Human("Russia", 2, 134),
                new Robot("Japan", 4, 600),
                new Cat("Germany", 1, 450),
                new Human("Spain", 2, 367),
                new Robot("Russia", 3, 800),
                new Cat("Portugal", 2, 590),
        };

        Obstacles[] obstacles = {
                new Treadmill(100),
                new Wall(1),
                new Treadmill(120),
                new Wall(2),
                new Treadmill(150),
                new Wall(3),
                new Treadmill(450),
                new Wall(4),
        };

        for (OlympicGames player : participant) {
            for (Obstacles obs : obstacles) {
                if(obs instanceof Wall){
                    if(!player.jump((Wall) obs)) break;
                } else{
                    if(!player.run((Treadmill) obs)) break;
                }
            }
            System.out.println();
        }
    }
}
