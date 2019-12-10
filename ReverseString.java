package com.company.homework;
/*
12. Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT
 */
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string: ");
        char[] letters = scan.nextLine().toCharArray();
        System.out.print("Reverse string: "+"\n");
        for(int i = letters.length - 1; i >= 0; i--){
            System.out.print(letters[i]);
        }

    }
}
