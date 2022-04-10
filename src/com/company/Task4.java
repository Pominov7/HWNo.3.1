package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // 1. ввод данных
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменных x,y и ввод с клавиатуры
        System.out.print("Введите любое число x: ");
        double x = in.nextDouble();//считали введенное число x
        System.out.print("Введите любое число y: ");
        double y = in.nextDouble();//считали введенное число y
        in.close();

        // 2. решение с использованием if else и вывод ответа
        if (x > 0 && y > 0) {
            System.out.println("Точка находится в I четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка находится в II четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка находится в III четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка находится в IV четверти");
        } else if (x == 0 && y == 0) {
            System.out.println("Точка находится на пересечении осей абсциссы и ординаты");
        } else {
            System.out.println("Некорректный ввод, введите положительное или отрицательное число, кроме 0");
        }
    }
}
