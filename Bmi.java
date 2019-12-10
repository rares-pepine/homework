package com.company.homework;
/*33. Write a Java program to compute body mass index (BMI).

Test Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Body Mass Index is 61.30159143458721
 */

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input weight in pounds:");
        double weight = in.nextDouble();
        System.out.println("Input height in inches:");
        double height = in.nextDouble();
        double bmi = (703 * weight) / ((height) * (height));
        System.out.println("Body Mass Index is:" + "\n" +  bmi);


    }
}
