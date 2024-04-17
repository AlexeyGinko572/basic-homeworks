package ru.otus.java.basic.homeworks.hw1;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 5");
        Scanner scanner = new Scanner(System.in);
        int numberPublic = scanner.nextInt();
        if(numberPublic == 1){
            greetings();
        } else if (numberPublic == 2){
            checkSign(-2,-3,-5);
        } else if (numberPublic == 3){
            selectColor();
        } else if (numberPublic == 4){
            compareNumbers();
        } else if (numberPublic == 5){
            addOrSubtractAndPrint(1, 2, false);
        } else {
            System.out.println("Надо ввести число от 1 до 5!");
        }
    }
    public static void greetings(){
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }
    public static void checkSign(int a, int b, int c){
        int result = a + b + c;
        if(result >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void selectColor(){
        int data = 120;
        if(data <= 10){
            System.out.println("Красный");
        } else if (data <= 20 ){
            System.out.println("Желтый");
        } else if (data > 20){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 20;
        int b = 3;
        if(a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if(increment == true){
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
