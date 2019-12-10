package com.company.homework;
/*4. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
*/

public class AreaPerimeterCircle {

    public static void main(String[] args) {
        final double radius = 7.5;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is=" + perimeter);
        System.out.println("Area is=" + area);

    }
}
