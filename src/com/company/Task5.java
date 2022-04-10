package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // 1. ввод данных
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменой dateBirth и ввод с клавиатуры
        System.out.print("Введите день Вашего рождения: ");
        int dayBirth = in.nextInt();//считали введенный день рождения
        System.out.print("Введите месяц Вашего рождения: ");
        int monthBirth = in.nextInt();//считали введенный месяц рождения
        System.out.print("Введите год Вашего рождения: ");
        int yearBirth = in.nextInt();//считали введенный год рождения
        in.close(); // закрываем сканер по окончанию чтения

        // 2. решение:  с помощью условий if else находим год рождения
        if (yearBirth % 12 == 4) {
            System.out.println("Год крысы");
        } else if (yearBirth % 12 == 5) {
            System.out.println("Год быка");
        } else if (yearBirth % 12 == 6) {
            System.out.println("Год тигра");
        } else if (yearBirth % 12 == 7) {
            System.out.println("Год кролика");
        } else if (yearBirth % 12 == 8) {
            System.out.println("Год дракона");
        } else if (yearBirth % 12 == 9) {
            System.out.println("Год змеи");
        } else if (yearBirth % 12 == 10) {
            System.out.println("Год лошади");
        } else if (yearBirth % 12 == 11) {
            System.out.println("Год овцы");
        } else if (yearBirth % 12 == 0) {
            System.out.println("Год обезьяны");
        } else if (yearBirth % 12 == 1) {
            System.out.println("Год петуха");
        } else if (yearBirth % 12 == 2) {
            System.out.println("Год собаки");
        } else if (yearBirth % 12 == 3) {
            System.out.println("Год свиньи");
        }
        // с помощью условий if else определяем период знака зодиака
        if (dayBirth >= 21 && dayBirth <= 31 && monthBirth == 3
                || dayBirth >= 1 && dayBirth <= 20 && monthBirth == 4) {
            System.out.println("Овен");
        } else if (dayBirth >= 21 && dayBirth <= 31 && monthBirth == 4
                || dayBirth >= 1 && dayBirth <= 21 && monthBirth == 5) {
            System.out.println("Телец");
        } else if (dayBirth >= 22 && dayBirth <= 31 && monthBirth == 5
                || dayBirth >= 1 && dayBirth <= 21 && monthBirth == 6) {
            System.out.println("Близнецы");
        } else if (dayBirth >= 22 && dayBirth <= 31 && monthBirth == 6
                || dayBirth >= 1 && dayBirth <= 22 && monthBirth == 7) {
            System.out.println("Рак");
        } else if (dayBirth >= 23 && dayBirth <= 31 && monthBirth == 7
                || dayBirth >= 1 && dayBirth <= 21 && monthBirth == 8) {
            System.out.println("Лев");
        } else if (dayBirth >= 22 && dayBirth <= 31 && monthBirth == 8
                || dayBirth >= 1 && dayBirth <= 23 && monthBirth == 9) {
            System.out.println("Дева");
        } else if (dayBirth >= 24 && dayBirth <= 31 && monthBirth == 9
                || dayBirth >= 1 && dayBirth <= 23 && monthBirth == 10) {
            System.out.println("Весы");
        } else if (dayBirth >= 24 && dayBirth <= 31 && monthBirth == 10
                || dayBirth >= 1 && dayBirth <= 22 && monthBirth == 11) {
            System.out.println("Скорпион");
        } else if (dayBirth >= 23 && dayBirth <= 31 && monthBirth == 11
                || dayBirth >= 1 && dayBirth <= 22 && monthBirth == 12) {
            System.out.println("Стрелец");
        } else if (dayBirth >= 23 && dayBirth <= 31 && monthBirth == 12
                || dayBirth >= 1 && dayBirth <= 20 && monthBirth == 1) {
            System.out.println("Козерог");
        } else if (dayBirth >= 21 && dayBirth <= 31 && monthBirth == 1
                || dayBirth >= 1 && dayBirth <= 19 && monthBirth == 2) {
            System.out.println("Водолей");
        } else if (dayBirth >= 20 && dayBirth <= 31 && monthBirth == 2
                || dayBirth >= 1 && dayBirth <= 20 && monthBirth == 3) {
            System.out.println("Рыбы");
        }
    }
}
        // Второй способ определения знака по году рождения с помощью switch, так же работает,
        //  но слишком много кода
          /* switch (yearBirth) {
            case 1948, 1960, 1972, 1984, 1996, 2008, 2020 -> System.out.println("Год крысы");
            case 1949, 1961, 1973, 1985, 1997, 2009, 2021 -> System.out.println("Год быка");
            case 1950, 1962, 1974, 1986, 1998, 2010, 2022 -> System.out.println("Год тигра");
            case 1951, 1963, 1975, 1987, 1999, 2011, 2023 -> System.out.println("Год кролика");
            case 1952, 1964, 1976, 1988, 2000, 2012, 2024 -> System.out.println("Год дракона");
            case 1953, 1965, 1977, 1989, 2001, 2013, 2025 -> System.out.println("Год змеи");
            case 1954, 1966, 1978, 1990, 2002, 2014, 2026 -> System.out.println("Год лошади");
            case 1955, 1967, 1979, 1991, 2003, 2015, 2027 -> System.out.println("Год овцы");
            case 1956, 1968, 1980, 1992, 2004, 2016, 2028 -> System.out.println("Год обезьяны");
            case 1957, 1969, 1981, 1993, 2005, 2017, 2029 -> System.out.println("Год петуха");
            case 1958, 1970, 1982, 1994, 2006, 2018, 2030 -> System.out.println("Год собаки");
            case 1959, 1971, 1983, 1995, 2007, 2019, 2031 -> System.out.println("Год свиньи");
            default -> System.out.println("Некорректный ввод, введите год в диапазоне от 1948 до 2031 ");
        }*/



