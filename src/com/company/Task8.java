package com.company;

import java.util.Scanner;

public class Task8 {
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
        double xEven = x % 2;// проверяем остаток от деления числа x
        double yEven = y % 2;//проверяем остаток от деления числа y
        if (xEven == 0 && yEven == 0) {
            System.out.println("Оба числа чётные");
        } else if (xEven != 0 && yEven != 0) {
            System.out.println("Оба числа нечётные");
        } else {
            System.out.println();//во всех других случаях программа ничего не выводит
        }
    }
}