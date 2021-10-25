package com.pb.sydorin.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();
        String phrase2 = scan.nextLine();

        getAnagram(phrase, phrase2);
    }

    public static void getAnagram(String s1, String s2){
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1, c2))
            System.out.println("Это анаграмма");
        else
            System.out.println("Это не анаграмма");
    }
}
