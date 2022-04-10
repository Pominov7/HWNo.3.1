package com.company;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        // 1. ввод данных
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменной sixDigit и ввод с клавиатуры
        System.out.print("Введите шестизначное число: ");
        int sixDigit = in.nextInt();//считали введенное шестизначное число
        in.close();//закрываем сканер по окончанию чтения

        // 2. решение
        // С помощью остатка от деления находим:
        int unit = sixDigit % 10;//еденицы числа
        int dozen = (sixDigit % 100) / 10;//сотни числа
        int hundred = (sixDigit % 1000) / 100;//десятки числа
        int sumDoz = unit + dozen + hundred;// сумму последних трёх  чисел
        int thousand = (sixDigit % 10000) / 1000;//тысячи числа
        int tensThous = (sixDigit % 100000) / 10000;//десятки тысяч числа
        int hundThous = sixDigit / 100000;//сотни тысяч числа
        int thouSum = thousand + tensThous + hundThous;//сумму первых трёх  чисел
        //С помощью условия if else определяем счастливый билет или нет
        if (sumDoz == thouSum) {
            System.out.print("Счастливый билет");//вывод ответа
        } else if (sumDoz != thouSum) {
            System.out.print("Несчастливый билет");//вывод ответа
        }
    }
}