package com.cis084javaprogramming;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Name: Brendan Bobryk
 * Student ID #: 1036738
 * Class: CIS 084 Java Programming
 * Date: 10/17/23
 * Program: Control Structures
 */

public class App {
    public static void main(String[] args) {
        // Declaring variables
        int age, vaccinationChoice;
        boolean teacher, isOver65, hasMedical, eligible;
        String name;

        // Opens scanner and displays first prompt for user
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        name = input.nextLine();
        System.out.println("Are you a teacher? (Y/N): ");
        char answer = input.next().charAt(0);

        // If the user is not a teacher, then the result is given and the program stops
        teacher = (answer == 'y' || answer == 'Y');
        if (!teacher) {
            System.out.println("You are not eligible for a vaccination.");
            input.close();
            return;
        }

        // Continues prompting the user for information and retains the results
        System.out.println("How old are you?");
        age = input.nextInt();
        isOver65 = (age > 65);
        System.out.println("Do you have a medical condition? (Y/N): ");
        answer = input.next().charAt(0);
        hasMedical = (answer == 'y' || answer == 'Y');

        // Determines if the user is eligible for a vaccination
        eligible = (isOver65 || hasMedical);

        if (!eligible) {
            System.out.println("You are not eligible for a vaccination.");
            input.close();
            return;
        }

        System.out.println("Which vaccination would you like? (#1-8): ");

        String[] vaccinations = { "pfizer-alpha", "moderna-alpha", "johnson-alpha", "pfizer-omega", "pfizer-kappa",
                "moderna-delta", "moderna-gamma", "moderna-zeta" };

        for (int i = 0; i < vaccinations.length; i++) {
            System.out.println(i + 1 + ". " + vaccinations[i]);
        }

        vaccinationChoice = input.nextInt();

        // Closes scanner
        input.close();

        // Displays results
        System.out.println(name + " is a teacher who is " + age + " years old.");
        System.out.println("They have chosen the vaccination: " + vaccinations[vaccinationChoice - 1]);
    }
}