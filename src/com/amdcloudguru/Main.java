package com.amdcloudguru;

import java.math.BigDecimal;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
       /* Double numberOne = 0.02;
        Double numberTwo = 0.03;
        Double result = numberTwo - numberOne;

        System.out.println(result); */

        BigDecimal numberOne = new BigDecimal("0.04");
        BigDecimal numberTwo = new BigDecimal("0.03");
        BigDecimal result = numberTwo.subtract(numberOne);

        System.out.println(numberOne.compareTo(numberTwo));

        if (numberOne.compareTo(numberTwo) > 0 ) {
            // Logic Here
        }

//        System.out.println(result);

        // Comparing Primitive Double Type
//        double a = 1;
//        double b = 2;
//        System.out.println(a <= b);


//        ZonedDateTime now = ZonedDateTime.now(); // Date + Time (Zone) along with UTC
//
//        LocalDateTime nowLDT = LocalDateTime.now(); // Date + Time (Zone) without UTC
//
//        LocalDate localDate = LocalDate.now(); // Date
//
//        LocalTime localTime = LocalTime.now(); // Time
//
//        Instant instant = Instant.now(); // Shows you Date + Time in UTC
//
//        System.out.println(now);
//        System.out.println(nowLDT);
//        System.out.println(localDate);
//        System.out.println(localTime);
//        System.out.println(instant);

//        LocalDate localDate = LocalDate.now(ZoneId.of("Australia/West"));
//        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Australia/West")); // to see Date + Time of a certain zone

//        ZoneId.getAvailableZoneIds().forEach(System.out::println); // to see all ZoneID

//        System.out.println(localDateTime);

//        LocalDate someDate = LocalDate.of(2000, Month.SEPTEMBER, 1);
//
//        System.out.println(someDate.minus(7, ChronoUnit.YEARS));
//
//        System.out.println(someDate.isBefore(nowLDT.toLocalDate()));
//
//        System.out.println(someDate.getYear());
//        System.out.println(someDate.getMonth());
//        System.out.println(someDate.getDayOfWeek());


    }
}
