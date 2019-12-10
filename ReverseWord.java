package com.company.homework;

import java.util.Scanner;

/*
25. Write a Java program to reverse a word.
Sample Output:

Input a word: dsaf
Reverse word: fasd

 */
public class ReverseWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a word: ");
        String word = in.nextLine();
        word = word.trim();
        String result = "";
        char[] ch=word.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        System.out.println("Reverse word: "+result.trim());
    }
}

