package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        // 1. ввод данных
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменных start,end и ввод с клавиатуры
        System.out.print("Введите начало отрезка: ");
        double start = in.nextDouble();//считали начало отрезка
        System.out.print("Введите конец отрезка: ");
        double end = in.nextDouble();//считали конец отрезка
        in.close();//закрываем сканер по окончанию чтения

        // 2. решение с использованием if else и вывод ответа
        if (start < end) {
            System.out.print("Подъём в горку");
        } else if (start > end && end != 0) {
            System.out.print("Спуск с горки");
        } else if (start == end) {
            System.out.print("Ровная дорога");
        } else if (start > 0 && end == 0) {
            System.out.print("Отвесная гора");
        }
    }
}