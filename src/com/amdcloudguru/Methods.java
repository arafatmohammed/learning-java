package com.amdcloudguru;

import java.time.LocalDate;

public class Methods {
    public static void main(String[] args) {
        // public : Access Modifiers
        // static : (Optional) Static means it belongs to a Class, and NOT to an instance
        // void : Return type - void does not return anything. Can be String, int, boolean, etc. Can also be an object ie., Point, Date, etc
        // main: name of the method
        // String[] args : Argument : Data that is passed into a method
        var x = incrementNumber(0);
        print(x);
        var now = getCurrentDate();
        var tenDays = getDateMinusDays(10);
        System.out.println(tenDays);
        var hundredDays = getDateMinusDays(100);
        System.out.println(hundredDays);
    }

    private static int incrementNumber(int value){
                return value + 1;
    }

    private static void print(int value) {
        System.out.println(value);
    }

    private static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    private static LocalDate getDateMinusDays(int v) {
        return LocalDate.now().minusDays(v);
    }
}
