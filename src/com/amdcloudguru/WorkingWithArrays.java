package com.amdcloudguru;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int singleNumber = 1;
        // here "number" can only one number(value)
        // Introducing Array
        int[] numbers = new int[3]; // Long way of writing variables
        numbers[0] = 1; // Starts from Zero
        numbers[1] = 20;
        numbers[2] = 500;
//        numbers[3] = 600;

        int[] numbersArray = {1, 20, 500, 4};
        numbersArray[3] = 700;
//        System.out.println(Arrays.toString(numbersArray));

//        for (int number: numbersArray) {
//            System.out.println(number);
//        }

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }
    }
}
