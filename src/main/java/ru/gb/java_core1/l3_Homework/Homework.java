package ru.gb.java_core1.l3_Homework;

import java.util.Arrays;
import java.util.Random;

public class Homework {
    public static Random random = new Random();
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 0, 0, 0, 1, 1, 0, 1};
        int[] secondArray = new int[100];
        int[] thirdArray = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] fourthArray = new int[5][5];
        int[] fifthArray = new int[]{1,2,3,2,5,7,9,10,33,0};
        int[] sixthArray = new int[]{1,2,5,3,8,3};
        int[] seventhArray = new int[]{1,2,5,3};
        reverseArrayValues(firstArray);
        inputValuesToArray(secondArray);
        checkValuesByCondition(thirdArray);
        inputDiagonalValuesOfArray(fourthArray);
        System.out.println("\n" + Arrays.toString(createArray(15, 3)) + "\n");
        findForMinMaxValuesOfArray(fifthArray);
        System.out.println(checkPartsOfArray(sixthArray) + "\n");
        System.out.println(Arrays.toString(deposeValueToNewIndex(seventhArray, random.nextInt(100) - 50)));
    }

    public static void reverseArrayValues(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 1){
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }
        System.out.println(Arrays.toString(a) + "\n");
    }

    public static void inputValuesToArray(int[] a){
        for (int i = 1; i <= a.length; i++) {
            a[i-1] = i;
        }
        System.out.println(Arrays.toString(a) + "\n");
    }

    public static void checkValuesByCondition(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6){
                a[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(a) + "\n");
    }

    public static void inputDiagonalValuesOfArray(int[][] a){
        int minIndex = 0, maxIndex = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            a[i][minIndex] = 1;
            a[i][maxIndex] = 1;
            minIndex++;
            maxIndex--;
            System.out.println(Arrays.toString(a[i]));
        }
    }

    public static int[] createArray(int length, int value){
        int[] array = new int[length];
        Arrays.fill(array, value);
        return array;
    }

    public static void findForMinMaxValuesOfArray(int[] a){
        Arrays.sort(a); // правильно понимаю, что если искать просто в цикле, то будет О(n)? А так О(n*log(n))
        System.out.println("Min value:" + a[0] + "\nMax value:" + a[a.length-1] + "\n");
    }

    public static boolean checkPartsOfArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(Arrays.stream(Arrays.copyOfRange(a, 0, i+1)).sum() == Arrays.stream(Arrays.copyOfRange(a, i+1, a.length)).sum() ){
                return true; // понимаю, что можно было просто в цикле считать суммы по индексам, у меня же получается,
            }                // что при каждой итерации создается новая пара массивов? Зная, что есть уборщик мусора, он
        }                    // их получается удаляет, получается ничего страшного?
        return false;
    }

    public static int[] deposeValueToNewIndex(int[] a, int shift){
        int remainder = shift % a.length;
        System.out.println("Remainder:" + remainder);
        if (remainder != 0){
            int[] copyArray = Arrays.copyOf(a, a.length);
            if (remainder > 0) {
                for (int i = 0; i < a.length; i++) {
                    if(i + remainder >= a.length){
                        a[i + remainder - a.length] = copyArray[i];
                    } else{
                        a[remainder + i] = copyArray[i];
                    }
                }
            } else if (remainder < 0){
                for (int i = 0; i < a.length; i++) {
                    if(Math.abs(remainder) > i){
                        a[i + remainder + a.length] = copyArray[i];
                    } else{
                        a[remainder + i] = copyArray[i];
                    }
                }
            }
            return a;
        }
        return a;
    }
}
