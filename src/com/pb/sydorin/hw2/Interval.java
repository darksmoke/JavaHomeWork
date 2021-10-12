package com.pb.sydorin.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int scanerA = scan.nextInt();

        if (scanerA >= 0 && scanerA <= 14){
            System.out.println("Число попадает в дипазон [0 - 14]");
        } else  if (scanerA >= 15 && scanerA <= 35){
            System.out.println("Число попадает в дипазон [15 - 35]");
        } else  if (scanerA >= 36 && scanerA <= 50){
            System.out.println("Число попадает в дипазон [36 - 50]");
        } else  if (scanerA >= 51 && scanerA <= 100){
            System.out.println("Число попадает в дипазон [51 - 100]");
        } else  if (scanerA > 100){
            System.out.println("Число больше 100");
        }
    }
}
