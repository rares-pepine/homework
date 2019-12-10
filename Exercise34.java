package com.company.homework;
/*
34. Write a Java program to rearrange all
the elements of an given array of
integers so that all the odd numbers come before all the even numbers
 */
import java.util.Arrays;

public class Exercise34 {
    public static void main(String[] args) {
        int[] array_nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int i = 0;
        System.out.println("Original Array: "+ Arrays.toString(array_nums));
        while(i < array_nums.length && array_nums[i] % 2 == 0)
            i++;

        for(int j = i + 1; j < array_nums.length; j++) {
            if(array_nums[j] % 2 != 0) {
                int temp = array_nums[i];
                array_nums[i] = array_nums[j];
                array_nums[j] = temp;
                i++;
            }
        }

        System.out.println("New Array: "+Arrays.toString(array_nums));
    }
}
