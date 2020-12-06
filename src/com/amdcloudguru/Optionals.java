package com.amdcloudguru;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        String brand = null;
        // Using orElseGet with ofNullable
//        Optional.of(brand); // .of is used when you know the value is not null
//        String theBrand = Optional.ofNullable(brand).orElse("Samsung"); // Functional Programming
//        System.out.println(theBrand);

        // Using orElseGet with Lambda along with ofNullable
//        String theBrand = Optional.ofNullable(brand).orElseGet(() -> {
//            //logic
//            return "Samsung";
//        });
//        System.out.println(theBrand);
//    }

        // Using map
        String theBrand = Optional.ofNullable(brand).map(String::toUpperCase).orElseGet(() -> {
                //loic
                return "Samsung";
                }
        );
        System.out.println(theBrand);
    }
}
