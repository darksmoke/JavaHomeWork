package com.pb.sydorin.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Угадай число! Если надоест введи 999.");
        System.out.print("Введите целое число от 0 до 100: ");

        Scanner scan = new Scanner(System.in);

        int scanerX = 0;
        int a = 0;
        int b = 100;
        int numberAttempts = 0;
        int randomNumber = a + (int) (Math.random() * b);

//        System.out.println("Загаданное число: " + randomNumber);

        do {
            scanerX = scan.nextInt();

            if (scanerX == 999) {
                System.out.println("Пока. Приходи еще.");
                System.exit(0);
            }

            if (scanerX < 0 || scanerX > 100) {
                System.out.println("Вы ввели число из недопустимого диапозона! Начните сначала.");
                System.exit(0);
            }

            if (scanerX < randomNumber)
                System.out.println("Загаданное число больше чем " + scanerX);

            if (scanerX > randomNumber)
                System.out.println("Загаданное число меньше чем " + scanerX);

            if (scanerX != randomNumber)
                System.out.print("Попробуй еще раз! Введи число: ");

            numberAttempts++;

        } while (scanerX != randomNumber);

        System.out.println("Поздравляю! Вы отдгадали число!");
        System.out.println("Всего попыток: " + numberAttempts);
    }
}
