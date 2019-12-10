package com.company.homework;
/*5. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20

*/
public class AreaPerimeterRectangle {
    public static void main(String[] args) {
        double width = 5.5;
        double height = 8.5;
        double area = width * height;
        double perimeter = 2 * (width * height);
    System.out.println("Perimeter rectangle is = " + perimeter);
    System.out.println("Area rectangle is = " + area);

    }
}
