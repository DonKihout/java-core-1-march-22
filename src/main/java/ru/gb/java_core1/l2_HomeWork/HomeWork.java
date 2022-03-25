package ru.gb.java_core1.l2_HomeWork;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(checkSum(3, 10));
        printResult(-5);
        System.out.println(checkBoolean(200));
        printString("Hello World!", 4);
        System.out.println(checkYear(304));
    }

    public static boolean checkSum(int a, int b){
        int sum = a + b;
        if (10 <= sum && sum <= 20 ){
            return true;
        } else {
            return false;
        }
    }

    public static void printResult(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkBoolean(int a){
        if (a <= 0){
            return true;
        } else {
            return false;
        }
    }

    public static void printString(String a, int b){
        for (int i = 0; i < b; i ++){
            System.out.println(a);
        }
    }

    public static boolean checkYear(int year){
        if ((year % 4 == 0) && (year % 100 != 0 | year % 400 == 0)){
            return true;
        } else{
            return false;
        }
    }
}
