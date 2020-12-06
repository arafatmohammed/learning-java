package com.amdcloudguru;

import java.util.Optional;

public class NullPointer {
    public static void main(String[] args) {
        String brand =null;
        // Method 1
//        if (brand != null) {
//            System.out.println(brand.toUpperCase());
//        } else {
//            System.out.println("Brand is null");
//        }
        // Method 2
//        try {
//            System.out.println(brand.toUpperCase());
//        } catch (NullPointerException e) {
//            System.out.println("Brand is null");
//        }

        // Method 3 - Preferred Way - in Optionals Class


    }
}
