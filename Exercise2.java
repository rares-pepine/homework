package com.company.homework;
import java.util.Scanner;

/*2. Write a Java program that takes a number as input and prints its multiplication table up to 10.

Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/
public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number");
        int num = in.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(num + " x " + (i + 1) + " = " +
                    (num * (i + 1)));
        }
    }
}
