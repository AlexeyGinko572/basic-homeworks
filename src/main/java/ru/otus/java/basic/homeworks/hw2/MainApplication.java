package ru.otus.java.basic.homeworks.hw2;


import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        int[] arr = {1, 3, 10, 2, 55};
        sumAllElementAboveFiveAndPrint(arr);
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        insertInt(arr2, 2);
        int[] arr3 = {10, 20, 30, 40, 50};
        increase(5, arr3);
        int[] arr4 = {1, 22, 5, 7, 9, 2, 4, 6, 8, 10};
        halfAbove(arr4);

    }
    public static void numberStrok(int number, String stroka) {
        for (int i = 0; i < number; i++) {
            System.out.println(stroka);
        }
    }
    public static void sumAllElementAboveFiveAndPrint(int[] array) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 5) {
                count++;
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }
    public static void insertInt(int[] array2, int number) {
        for (int i = 0; i < array2.length; i++) {
            array2[i] = number;
        }
        System.out.println(Arrays.toString(array2));
    }
    public static void increase(int number, int[] array3) {
        for (int i = 0; i < array3.length; i++) {
            array3[i] += number;
        }
        System.out.println(Arrays.toString(array3));
    }
    public static void halfAbove(int[] array4) {
        int sumFirst = 0;
        for (int i = 0; i < array4.length / 2; i++) {
            sumFirst = sumFirst + array4[i];
        }
        int sumSecond = 0;
        for (int i = array4.length / 2; i < array4.length; i++) {
            sumSecond = sumSecond + array4[i];
        }
        if (sumFirst > sumSecond){
            System.out.println(sumFirst);
        } else {
            System.out.println(sumSecond);
        }
    }
}
