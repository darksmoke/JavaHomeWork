package com.pb.sydorin.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] myArray = new int[10];
        int sum = 0;
        int positiveNumber = 0;
        int tempNumber = 0;
        boolean sort = false;

        for (byte i = 0; i < myArray.length; i++){
            System.out.print("Введите " + i + " число массива: ");
            myArray[i] = scan.nextInt();
        }


        System.out.print ("\nЭлементы массива:");
        for (byte i = 0; i < myArray.length; i++) {
            System.out.print (" " + myArray[i] );
            if(i < myArray.length - 1)
                System.out.print(",");
            else
                System.out.println();
        }


        System.out.print ("Сумма всех элементов массива: ");
        for (byte i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.print(sum +"\n");


        System.out.print ("Кол-во положительных элементов в массиве: ");
        for (byte i = 0; i < myArray.length; i++) {
            if (myArray[i] > 0) // Ноль не является положительным или отрицательным числом
                positiveNumber ++;
        }
        System.out.print(positiveNumber +"\n");


        while(!sort) {
            sort = true;
            for (int i = 0; i < myArray.length-1; i++) {
                if(myArray[i] > myArray[i+1]){
                    sort = false;

                    tempNumber = myArray[i];
                    myArray[i] = myArray[i+1];
                    myArray[i+1] = tempNumber;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));

    }


}
