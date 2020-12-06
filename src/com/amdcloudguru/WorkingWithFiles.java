package com.amdcloudguru;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithFiles {
    public static void main(String[] args) {
        String filename = "src/data.csv";
        File file = new File(filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println(file.getName() + " created");
            } catch (IOException e) {
                System.out.println("Error Creating File");
                System.out.println(e);
            }

        }

        // Overwriting a file every time you run the program
        try {
            FileWriter fileWriter = new FileWriter(filename);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("id,name,email");
            printWriter.println("1,Jamila,jamila@gmail.com");
            printWriter.println("2,Alex,alex@hotmail.com");
            printWriter.println("3,Musa,musa@hotmail.com");
            printWriter.println("4,Ahmed,ahmed@yahoo.com");
            printWriter.flush();
            printWriter.close();
            System.out.println("contents added to the file");
        } catch (IOException e) {
            System.out.println(e);
        }

        // Appending to the file
//        try {
//            FileWriter fileWriter = new FileWriter(filename, true);
//            PrintWriter printWriter = new PrintWriter(fileWriter);
////            printWriter.println("id,name,email");
//            printWriter.println("1,Jamila,jamila@gmail.com");
//            printWriter.println("2,Alex,alex@hotmail.com");
//            printWriter.println("3,Musa,musa@hotmail.com");
//            printWriter.flush();
//            printWriter.close();
//            System.out.println("contents added to the file");
//        } catch (IOException e) {
//            System.out.println(e);
//        }

        // Reading from File

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = "";

            System.out.println("header = " + reader.readLine());

            //            reader.readLine(); // Skip the first line i.,e header

            List<User> users = new ArrayList<>();

            // Converting items of the csv as objects
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] split = line.split(",");
                int id = Integer.parseInt(split[0]);
                String name = split[1];
                String email = split[2];
                User user = new User(id, name, email);
                users.add(user); // Adding all users to a list
            }

            reader.close();
            System.out.println("Looping through users list");
            users.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println(e);
        }



    }
}
