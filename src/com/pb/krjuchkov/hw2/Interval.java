package com.pb.krjuchkov.hw2;
import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        System.out.println("enter operand1");
        operand1 = scan.nextInt();
        if (operand1 >= 0 && operand1 <= 14) {System.out.println("[0 -14]");}
            if (operand1 >= 15 && operand1 <= 35) {System.out.println("[15 - 35]");}
                if (operand1 >= 36 && operand1 <= 50) {System.out.println("[36 - 50]");}
                    if (operand1  >=51 && operand1 <= 100) {System.out.println("[51 - 100]");}
                        if (operand1 > 100) {System.out.println("invalid operand1");}
                            if (operand1 < 0) {System.out.println("invalid operand1");}

    }
}
    //Предложите пользователю ввести целое число и сохраните его в переменную с произвольным именем.
      //  Программа должна выяснить в какой промежуток попадает введенное число [0 -14] [15 - 35] [36 - 50] [51 - 100].
        //Вывести на экран сообщение с подходящим промежутком.
        //ли введенное число не попадает в один из имеющихся промежутков, то вывести соответствующее сообщение.