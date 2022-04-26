package ru.gb.java_core2.l2_Homework;


public class MyExceptions {
    public static void main(String[] args) {
        String[][] correctArray = new String[][] {
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"}
        };

        String[][] sizeExceptionArray = new String[][] {
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"}
        };

        String[][] dataExceptionArray = new String[][] {
                {"1","2","sdf","4"},
                {"1","2","fgfg","4"},
                {"1","2","3","jyju"},
                {"1","2","3","4"}
        };

        System.out.println(arrayIntSum(correctArray));
        System.out.println(arrayIntSum(sizeExceptionArray));
        System.out.println(arrayIntSum(dataExceptionArray));



    }
    public static int arrayIntSum(String[][] array){
        int sum = 0;
        if (array.length == 4) {
            for (String[] strings : array) {
                if (strings.length == 4) {
                    for (String string : strings) {
                        try {
                            sum += Integer.parseInt(string);
                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException("Can not to parse string to int!!!");
                        }
                    }
                } else throw new MyArraySizeException("Size of array not 4*4!!!");
            }
        } else throw new MyArraySizeException("Size of array not 4*4!!!");
        return sum;
    }
}
