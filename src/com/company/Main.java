package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    final static String filename = "input.txt";

    public static void main(String[] args) {

        Scanner scanner = null;
        File file = new File(filename);
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }

        while(scanner.hasNextLine()) {
            String data = scanner.nextLine();
            String[] numbers = data.split("[^0-9]");
            for(int i = 0; i < numbers.length; i++) {

                if (numbers[i].isEmpty()) {
                    continue;
                } else {
                    if (Integer.parseInt(numbers[i]) >= 10) {
                        System.out.println(data);
                    }
                }
            }
        }
        scanner.close();
    }
}