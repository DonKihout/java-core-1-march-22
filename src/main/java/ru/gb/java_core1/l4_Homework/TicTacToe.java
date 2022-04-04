package ru.gb.java_core1.l4_Homework;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.*;

public class TicTacToe {
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char DOT_EMPTY = '.';

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    private static char[][] field;
    private static char dotHuman;
    private static char dotAi;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int scoreHuman;
    private static int scoreAi;
    private static int roundCounter;
    private static int winLength;
    private static int x;
    private static int y;
    private static int counter;
    private static int aiX;
    private static int aiY;
    private static boolean flag = false;

    public static void main(String[] args) {
        startNewGame();
    }

    private static void startNewGame() {
        while (true) {
            chooseDot();
            playRound();

            System.out.printf("SCORE:    HUMAN     AI\n" +
                    "            %d       %d\n", scoreHuman, scoreAi);

            System.out.print("Want to play again ? (Y or N) >>> ");

            if (!scanner.next().toLowerCase(Locale.ROOT).equals("y")) {
                System.out.println("BYE");
                break;
            }
        }
    }

    private static void playRound() {
        do {
            System.out.print("Input size of field and length of win>>> ");
            fieldSizeY = scanner.nextInt();
            fieldSizeX = scanner.nextInt();
            winLength = scanner.nextInt();
        } while (!(checkFieldConfigCorrectness(fieldSizeY, fieldSizeX, winLength)));

        System.out.printf("Round %d start\n", ++roundCounter);
        initField();
        printField();
        if (dotHuman == DOT_X) {
            humanFirst();
        } else {
            aiFirst();
        }
    }

    private static boolean checkFieldConfigCorrectness(int sizeY, int sizeX, int winLength){
        return sizeY >= 3 && sizeX >= 3 &&
                (winLength <= sizeX | winLength <= sizeY) && (winLength > 2);
    }

    private static void humanFirst() {
        while (true) {
            humanTurn();
            printField();
            if (gameCheck(dotHuman)) {
                break;
            }
            aiTurn();
            printField();
            if (gameCheck(dotAi)) {
                break;
            }
        }
    }

    private static void aiFirst() {
        while (true) {
            aiTurn();
            printField();
            if (gameCheck(dotAi)) {
                break;
            }
            humanTurn();
            printField();
            if (gameCheck(dotHuman)) {
                break;
            }
        }
    }

    private static boolean gameCheck(char dot) {
        counter++;
        if (counter >= 5) flag = true;
        if (checkWin(dot, flag) && dot == dotHuman) {
            System.out.println("Human win!");
            scoreHuman++;
            return true;
        } else if (checkWin(dot, flag) && dot == dotAi) {
            System.out.println("AI win!");
            scoreAi++;
            return true;
        }
        return checkDraw();
    }

    private static void chooseDot() {
        System.out.print("Type 'X' to play with X and for 0 type anything >>> ");

        if (scanner.next().toLowerCase(Locale.ROOT).equals("x")) {
            dotHuman = DOT_X;
            dotAi = DOT_O;
        } else {
            dotHuman = DOT_O;
            dotAi = DOT_X;
        }
    }

    private static void aiTurn() {
        do {
            aiX = random.nextInt(fieldSizeX);
            aiY = random.nextInt(fieldSizeY);
        } while (!isCellValid(aiY, aiX));

        field[aiY][aiX] = dotAi;
    }

    private static void humanTurn() {


        do {
            System.out.print("Please enter coordinates x & y >>>> ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x));

        field[y][x] = dotHuman;
    }

    private static boolean checkWin(char dot, boolean flag) {
        if (flag){
            for (int i = 0; i < fieldSizeX; i++) {
                if ((field[i][0] == dot) && (field[i][1] == dot) && (field[i][2] == dot) || (field[0][i] == dot) &&
                        (field[1][i] == dot) && (field[2][i] == dot)){
                    return true;
                }
                if ((field[0][0]) == dot && (field[1][1]) == dot && (field[2][2]) == dot || (field[0][2]) == dot &&
                        (field[1][1]) == dot && (field[2][0]) == dot){
                    return true;
                }
            }
        }
        return false;

//        ArrayList<Integer> list = new ArrayList();
//        for (int i = 0; i < fieldSizeY; i++) {
//            for (int j = 0; j < fieldSizeX; j++) {
//                if(Math.abs(i - x) == 1 || Math.abs(j - y) == 1 || Math.abs(i - x) < winLength || Math.abs(j - y) < winLength){
//                    list.add(i);
//                    list.add(j);
//                }
//            }
//        }
//        for (int i = 0; i < list.size(); i += 2) {
//            if (field[list.get(i)][list.get(i+1)] == dot && ){
//                winPoints++;
//            }
//            if (winPoints == winLength){
//                return true;
//            }
//        }
//
//        return false;
    }

    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        System.out.println("DRAW!");
        return true;
    }

    private static boolean isCellValid(int y, int x) {
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY && field[y][x] == DOT_EMPTY;
    }

    private static void initField() {
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.print("+");

        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }

        System.out.println();
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");

            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }

        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
