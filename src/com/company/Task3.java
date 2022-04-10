package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // 1. ввод данных
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменой animal и ввод с клавиатуры
        System.out.print("Введите цифру из списка, которой соответствует животное:\n1 - кошка " +
                "\n2 - собака \n3 - корова \n4 - тигр \n5 - курица \n6 - баран \n7 - лошадь " +
                "\n8 - лягушка \n9 - свинья \n10 - утка \n ");
        int animal = in.nextInt();//считали введенную цифру
        in.close(); // закрываем сканер по окончанию чтения

        // 2. решение с использованием switch и вывод ответа
        switch (animal) {
            case 1 -> System.out.println("мяу-мяу");
            case 2 -> System.out.println("гав-гав");
            case 3 -> System.out.println("му-у");
            case 4 -> System.out.println("рррр");
            case 5 -> System.out.println("кудах-тах-тах");
            case 6 -> System.out.println("бее-бее");
            case 7 -> System.out.println("иго-го");
            case 8 -> System.out.println("ква-ква");
            case 9 -> System.out.println("хрю-Хрю");
            case 10 -> System.out.println("кря-кря");
            default -> System.out.println("Некорректный ввод, введите цифру в диапазоне от 1 до 10");
        }
    }
}