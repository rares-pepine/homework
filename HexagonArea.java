package com.company.homework;

import java.util.Scanner;

/*
10. Write a Java program to compute the area of a hexagon.
Area of a hexagon = (6 * s^2)/(4*tan(Ï€/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938
*/
public class HexagonArea {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the length");
        int s = in.nextInt();
        double area = (6 * s^2)/(4*Math.tan(Math.PI/6));
    System.out.println("Area of hexagon is ="+ area);
       }

}
