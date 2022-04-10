package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // 1. ввод данных
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменой hour и ввод с клавиатуры
        System.out.print("Введите кол-во часов от 0 до 24: ");
        double hour = in.nextDouble();//считали введенный час
        in.close(); // закрываем сканер по окончанию чтения

        // 2. решение с использованием if else и вывод ответа

        if (hour >= 0 && hour < 6) {
            System.out.println("Доброй ночи!");
        } else if (hour >= 6 && hour < 12) {
            System.out.println("Доброе утро!");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Добрый день!");
        } else if (hour >= 17 && hour < 24) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("Некорректный ввод, введите время в диапазоне от 0 до 24 часов");
        }
    }
}

