package com.cis084javaprogramming;

import java.util.Scanner;

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
        boolean teacher, isOver65, hasMedical;
        String eligible;

        // Opens scanner and displays first prompt for user
        Scanner input = new Scanner(System.in);
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
        System.out.println("Are you over 65 years old? (Y/N): ");
        answer = input.next().charAt(0);
        isOver65 = (answer == 'y' || answer == 'Y');
        System.out.println("Do you have a medical condition? (Y/N): ");
        answer = input.next().charAt(0);
        hasMedical = (answer == 'y' || answer == 'Y');

        // Determines if the user is eligible for a vaccination
        eligible = (isOver65 || hasMedical) ? "Yes" : "No";

        // Closes scanner
        input.close();

        // Displays results
        System.out.println("Is a teacher: " + teacher);
        System.out.println("Is over 65 years old: " + isOver65);
        System.out.println("Has a medical condition: " + hasMedical);
        System.out.println("Can be given a vaccination: " + eligible);
    }
}