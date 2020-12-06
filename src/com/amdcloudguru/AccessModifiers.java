package com.amdcloudguru;

public class AccessModifiers {
    public static void main(String[] args) {

    }

    static class Lens {} // package protected : It is not accessible by other packages besides amdcloudguru
    public static class Lens1 {} // public class, can be accessed by the world
    private static class Lens2 {} // can only be accessed within the AccessModifiers Class
    protected static class Len3 {} // Inheritance
    // Access Modifiers can be used for Classes and variables
}
