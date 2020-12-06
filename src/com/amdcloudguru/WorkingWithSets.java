package com.amdcloudguru;

import java.util.*;

public class WorkingWithSets {
    public static void main(String[] args) {
//        Set<Character> charactersSet = new HashSet<>( );
        // OR
//        Set<Character> charactersSet = new LinkedHashSet<>();
        // OR
        Set<Character> charactersSet = new TreeSet<>();
        charactersSet.add('A');
        charactersSet.add('A');
        charactersSet.add('B');
        charactersSet.add('C');
        charactersSet.add('D');
//        System.out.println(charactersSet);

        Iterator<Character> iterator = charactersSet.iterator();

        while (iterator.hasNext()) {
            Character character = iterator.next();
            System.out.println(character);
        }

//        for (char character :  charactersSet) {
//            System.out.println(character);
//        }



    }
}
