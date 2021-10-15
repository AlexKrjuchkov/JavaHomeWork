package com.pb.krjuchkov.hw2;
import com.sun.codemodel.internal.JCase;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double operand1;
        double operand2;
        double result;
        String sign;

        System.out.println("enter operand1");
        operand1 = scan.nextInt();
        System.out.println("enter the operator");
        sign = scan.next();
        System.out.println("enter operand2");
        operand2 = scan.nextInt();
        System.out.println("operand1 = " + operand1 + " operand2 = " + operand2 + " operator = " + sign);
            switch (sign) {
                case "+":
                    System.out.println("result " + (result = operand1 + operand2));
                    break;
                case "-":
                    System.out.println("result " + (result = operand1 - operand2));
                    break;
                case "*":
                    System.out.println("result " + (result = operand1 * operand2));
                    break;
                case "/":
                    if (operand2==0) { System.out.println("invalid operand2, must be more zero");            }
                        else { System.out.println("result " + (result = operand1 / operand2));            }
                    break;
                default:
                    System.out.println("Invalid operator, such +,-,*,/");
            }
            //if (operand2==0) { System.out.println("result " + (result = operand1 / operand2));            }

            //else { System.out.println("result " + (result = operand1 / operand2));            }






}
}
