package com.pb.sydorin.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        String[] arrayPhrase;

        String phrase = getString();
        arrayPhrase = getArray(phrase);

        for (int i = 0; i < arrayPhrase.length; i++)
            getUpper(arrayPhrase[i]);
    }

    public static String getString(){
        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();
        return phrase;
    }

    public static String[] getArray(String phrase) {
        String[] arrayPhrase;
        arrayPhrase = phrase.split("\\s");
        return arrayPhrase;
    }

    public static void getUpper(String word) {
        String firstLatter = word.substring(0, 1).toUpperCase();
        String allLine = firstLatter + word.substring(1).concat(" ");
        System.out.print(allLine);
    }
}
