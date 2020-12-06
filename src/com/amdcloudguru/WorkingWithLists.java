package com.amdcloudguru;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
//        int[] numbers = {1, 20, 500, 4}; // Arrays
        List<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(100);
        numbers.add(9000);
//        numbers.add("hello");
//        numbers.add(new Point(10, 10));
//        numbers.add('A');


//        numbers.remove(1);
//        System.out.println(numbers);
//        numbers.add(0, -1);
//        System.out.println(numbers);
//        System.out.println(numbers.contains(9000)); // checking if it contains a certain element
//        System.out.println(numbers.isEmpty()); // checks if list is empty
//        System.out.println(numbers.size());
////        numbers.clear(); // clears the lust
//        System.out.println(numbers.isEmpty());
//        System.out.println(numbers.size());
//
//        // loop
        for(int number : numbers) {
            System.out.println(number);
        }
//
//        // Another way of looping
//        numbers.forEach(System.out::println);


    }
}
