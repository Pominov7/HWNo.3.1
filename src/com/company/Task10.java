package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // 1. ввод данных
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменных n,m и ввод с клавиатуры
        System.out.print("Введите номер квартиры: ");
        int n = in.nextInt();//считали номер квартиры
        System.out.print("Введите количество квартир на этаже: ");
        int m = in.nextInt();//считали количество квартир на этаже
        in.close();//закрываем сканер по окончанию чтения

        // 2. решение
        final int maxFloor = 9;//максимальное число этажей
        int oneEntrance = m * maxFloor;// получаем кол-во квартир в подъезде
        int frontDoor = (n - 1) / oneEntrance + 1;//получаем номер подъезда запрошенной квартиры
        //С помощью условия if else определяем корректность введённого номера квартиры
        if (n <= 0) {
            System.out.println("Вы ввели некорректный номер квартиры");
        } else {
            System.out.println("Подъезд номер " + frontDoor);
        }
    }
}
