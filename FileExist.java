package com.company.homework;
/*38. Write a Java program to check if a file or directory specified by pathname exists or not.
 */

import java.io.File;

public class FileExist {
    public static void main(String[] args) {
        File myDirectory = new File("C:\\Users\\Rares\\IdeaProjects\\ucode-java-1\\src\\Homework\\LongestWord");
        if(myDirectory.exists()){
            System.out.println("The directory or file exists.");}
            else
                {
                System.out.println("The directory or file does not exists.");
            }

    }
}
