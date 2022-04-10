package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // 1. ввод данных
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменой days и ввод с клавиатуры
        System.out.print("Введите номер дня недели от 1 до 7: ");
        int days = in.nextInt();//считали введенный день недели
        in.close(); // закрываем сканер по окончанию чтения

        // 2. решение с использованием switch и вывод ответа
        switch (days) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Некорректный ввод, попробуйте ещё раз");
        }
    }
}


