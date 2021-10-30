package com.pb.krjuchkov.hw4;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {

        System.out.println("Введите строку");
        procedure();


    }
    public static void procedure(){
        String stroka;
        Scanner scan = new Scanner(System.in);
        stroka = scan.nextLine();
        char[] chars = stroka.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i - 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        System.out.println(new String(chars));

    }
}
//1. Создайте класс CapitalLetter в пакете hw4.
//Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
//Строку должен ввести пользователь.
//Пример работы:
//Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
//Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
//При выполнении задания использовать метод(ы).