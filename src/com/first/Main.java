package com.first;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    /*
      Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
      Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    */
    static void method6(int year) {
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");
    }

    /*
      Создать квадратный двумерный целочисленный массив (количество строк и столбцов
      одинаковое),​ ​ и ​ ​ с ​ ​ помощью​ ​ цикла(-ов)​ ​ заполнить​ ​ его​ ​ диагональные​ ​ элементы​ ​ единицами;
    */
    static void method10() {
        int[][] arr = new int[3][3];
        System.out.println("Array was :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
        System.out.println("Array now :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    /*
      Задать одномерный массив и найти в нем минимальный и максимальный элементы
    */
    static void method11() {
        int[] arr = {1, 5, 9, 22, 4, 7, 13, 54, 0, 66, 11, 24, 3, -2, 111};
        System.out.println("Array was " + Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Max element " + max);
        System.out.println("Min element " + min);
    }

    /*
      Написать метод,в который передается не пустой одномерный целочисленный массив,
      метод должен вернуть true если в массиве есть место,в котором сумма левой и правой части
      массива равны.Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) →
      false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не
      входят.
     */
    static boolean method12() {
        int[] arr = {1, 2, 2, 1};
        System.out.println("Array was " + Arrays.toString(arr));
        int SumMax = 0;
        int SumLeft = 0;
        for (int i = 0; i < arr.length; i++) {
            SumMax = SumMax + arr[i];
        }
        if (SumMax % 2 != 0) return false;
        for (int i = 0; i < arr.length; i++) {
            SumLeft = SumLeft + arr[i];
            if (SumLeft * 2 == SumMax) return true;
        }
        return false;
    }

    /*
      Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3
      попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли
      указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
      выводится​ ​ запрос​ ​ – ​ ​ «Повторить​ ​ игру​ ​ еще​ ​ раз?​ ​ 1 ​ ​ – ​ ​ да​ ​ / ​ ​ 0 ​ ​ – ​ ​ нет»(1​ ​ – ​ ​ повторить,​ ​ 0 ​ ​ – ​ ​ нет).
    */
    public static void method13() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        do {
            int compNumber;
            int gamerNumber;
            System.out.println("Comp has in mind a number from 0 to 9.");
            System.out.println("You have only 3 attempts to know it");
            compNumber = rand.nextInt(10);
            for (int i = 0; i < 3; i++) {
                if (i == 2) {
                    System.out.println("It is your last attempt");
                } else {
                    System.out.println("It is your " + (i + 1) + " attempt");
                }
                System.out.println("Input your number :");
                gamerNumber = sc.nextInt();
                if (gamerNumber == compNumber) {
                    System.out.println("Greetings! You Are Win!");
                    break;
                }
                if (gamerNumber < compNumber) {
                    System.out.println("Your number is less then COMPNUMBER");
                } else {
                    System.out.println("Your number is greater then COMPNUMBER");
                }
                if (i == 2) {
                    System.out.println("You loose this game");
                }

            }
            System.out.println("Hit the 'y' key if you want to play one more time");

        } while (sc.next().equals("y"));
        System.out.println("Bye");

    }
}
