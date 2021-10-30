package com.pb.krjuchkov.hw4;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String string1, string2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку 1");
        string1 = scan.nextLine();
        System.out.println("Введите строку 2");
        string2 = scan.nextLine();

        char[] Array1 = string1.toCharArray();
        char[] Array2 = string2.toCharArray();

        Arrays.sort(Array1);
        Arrays.sort(Array2);

        string1 = new String(Array1);
        string2 = new String(Array2);
        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }


    }

}
//2. Создайте класс Anagram в пакете hw4.
//Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
//Обе строки вводит пользователь.
//Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы.
//Программа должна игнорировать пробелы и знаки препинания.
//Пример анаграмм:
//Аз есмь строка, живу я, мерой остр. -> За семь морей ростка я вижу рост.
//Я в мире — сирота. -> Я в Риме — Ариост.
//При выполнении задания использовать метод(ы).
//Материал