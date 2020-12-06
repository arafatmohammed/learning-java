package com.amdcloudguru;

import java.awt.*;

public class FinalKeyword {
    public static void main(String[] args) {
        final var name = "Anna";
        final var number = Math.PI;
//        number++;
//        System.out.println(name);
//        System.out.println(number);
        final Point point = new Point(0,0);
//        point = new Point(100,100);
        point.x = 100;
        point.y = 100;
        System.out.println(point);

    }
}
