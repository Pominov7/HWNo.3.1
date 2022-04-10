package com.company;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        // 1. ввод данных
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменных a,b.c и ввод с клавиатуры
        System.out.print("Число а = ");
        double a = in.nextDouble();//считали введенное число а
        System.out.print("Число b = ");
        double b = in.nextDouble();//считали введенное число b
        System.out.print("Число c = ");
        double c = in.nextDouble();//считали введенное число c
        in.close();//закрываем сканер по окончанию чтения

        // 2. решение квадратного уравнения через дискриминант
        double d = b * b - 4 * a * c;//Вычисляем дискриминант по формуле
        double x1, x2;//Объявляем переменные x1,x2
        //Если d > 0 - уравнение имеет 2 корня, которые вычисляются по формулам:
        if (d > 0) {
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корень уравнения: x1 = " + x1);//вывод первого корня
            System.out.println("Корень уравнения: x2 = " + x2);//вывод второго корня
            //Если d = 0 - уравнение имеет ровно 1 корень, который вычисляется по формуле:
        } else if (d == 0) {
            double x;//Объявляем переменную x
            x = (-b / (2 * a));
            System.out.println("1 корень: " + x);//вывод корня
            //Если d < 0 - уравнение не имеет корней
        } else if (d < 0) {
            System.out.println("Нет корней");//вывод ответа
        }
    }
}