package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // 1. ввод данных
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменой year и ввод с клавиатуры
        System.out.print("Введите год: ");
        int year = in.nextInt();//считали введенный год
        in.close();

        // 2. решение с использованием if else и вывод ответа
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("В этом году 366 дней, високосный год");
        } else {
            System.out.println("В этом году 365 дней, не високосный год");
        }
    }
}