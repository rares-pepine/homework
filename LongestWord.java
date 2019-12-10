package com.company.homework;
/*39. Write a Java program to find the longest word in a text file.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) throws FileNotFoundException {
            new LongestWord().findLongestWords();

    }

    public void findLongestWords()  throws FileNotFoundException{
        String longest_word = "";
        String current;
        Scanner scan = new Scanner(new File("C:\\Users\\UltraBook\\IdeaProjects\\ucode-java\\src\\com\\company\\homework\\LongestWord"));

        while(scan.hasNext()){
            current = scan.next();
            if(current.length() > longest_word.length()) {
                longest_word = current;

            }
        }
        System.out.println("The longest word is:" + "\n"+ "[" + longest_word + "]");

    }

    }

