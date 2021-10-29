package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //Stops from skipping to the next input on enter
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and you are " + age);
            } else {
                System.out.println("Invalid Age");
            }
        } else {
            System.out.println("Unable to parse year of birth");

        }
        scanner.close();
    }
}
