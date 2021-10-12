package com.pb.sydorin.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Это калькулятор! Введите числа А и В затем знак операции (+, -, *, /)");

        System.out.print("Введите число А: ");
        Scanner scan = new Scanner(System.in);
        int scanerA = scan.nextInt();

        System.out.print("Введите число В: ");
        int scanerB = scan.nextInt();

        System.out.print("Введите знак из доступных (+, -, *, /): ");
        String operation = scan.next();

        switch (operation){
            case ("+"):
                System.out.println("Результат: "+ (scanerA + scanerB));
                break;
            case ("-"):
                System.out.println("Результат: "+ (scanerA - scanerB));
                break;
            case ("*"):
                System.out.println("Результат: "+ (scanerA * scanerB));
                break;
            case ("/"):
                if (scanerA == 0 || scanerB == 0){
                    System.out.println("Делить на 0 нельзя!");
                    break;
                }
                System.out.println("Результат: "+ (scanerA / scanerB));
                break;
            default:
                System.out.println("Вы не ввели знак для действия или ввели не правльно!");
                break;
        }
    }
}
