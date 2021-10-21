package com.pb.krjuchkov.hw3;

import java.util.Scanner;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        final int MAX_ATTEMPT = 5;
        int attempt = 0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int numberX = random.nextInt(100);
        System.out.println(numberX);
        System.out.println("Введите от 1 до 100, чтобы угадать число. У Вас 5 попыток. Чтобы выйти из игры введите 666");
        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            int number = scan.nextInt();

            if (number == numberX) {
                System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
                break;
            }

            if (number < numberX) {
                System.out.println("Вы не угадали, введенное число меньше заданного");
                continue;
            }
            if (number > numberX) {
                System.out.println("Вы не угадали, введенное число больше заданного");
                continue;
            }
            if (number == 666) {
                System.out.println("Вы вышли из игры");
                break;
            }

        }

        System.out.println("Конец игры!");





    }
}
//1. Написать программу игру “Bingo”.
  //      Создайте класс Bingo в пакете hw3.
    //    Программа должна загадать целое число в диапазоне от 0 до 100 и предложить пользователю его отгадать.
      //  При вводе числа пользователем, программа проверяет на соответствие с загаданным число и если числа совпали
//  вывести сообщение о том, что число отгадано.
        //Если числа не совпали, тогда следует вывести надпись о том, что задуманное число является больше
// или меньше вводимого.
        //Также программа ведет подсчет попыток, и выводит это количество после того как число угадали.
        //Предусмотреть возможность досрочного завершения программы, в случае если пользователь не желает
// продолжать угадывать число.
