package com.amdcloudguru;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();

        queue.add(new Person("James"));
        queue.add(new Person("Jamila"));
        queue.add(new Person("Abu"));

        System.out.println(queue);

        System.out.println(queue.peek()); // Who is first

        queue.poll(); // Remove first element

        System.out.println(queue);

        queue.forEach(person -> System.out.println(person.name)); // Loop

        // FIFO: First In Firs Out
    }

    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


}
