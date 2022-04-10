package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // 1. ввод данных
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменной letter и ввод с клавиатуры
        System.out.print("Введите любую букву: ");//ввод буквы
        char letter = in.next().charAt(0);//считали введенную букву
        in.close();//закрываем сканер по окончанию чтения

        // 2. решение: с помощью условий if else определяем в какой раскладке введена буква
        if (letter >= 'а' && letter <= 'я' || letter >= 'А' && letter <= 'Я' || letter == 'ё' || letter == 'Ё') {
            System.out.println("Введена буква в кирилице");//вывод ответа
        } else if (letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z') {
            System.out.println("Введена буква в латинской раскладке");//вывод ответа
        } else if (letter >= '0' && letter <= '9') {
            System.out.println("Введена цифра");//вывод ответа
        } else {
            System.out.println("Невозможно определить символ");//вывод ответа
        }
    }
}
