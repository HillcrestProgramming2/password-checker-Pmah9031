package org.hillcrest.chapter6.password;

import java.util.Scanner;

/**
 * Main application class for the Password Strength Checker program.
 *
 * This class handles user input and output. It prompts the user for a password,
 * uses the CriteriaChecker to evaluate password strength, and uses the
 * FeedbackGenerator to display suggestions for improvement.
 */
public class PasswordCheckerApp
{
    /**
     * The main entry point of the application.
     *
     * This method prompts the user to enter a password, evaluates the password
     * strength, generates feedback if needed, and prints the results to the console.
     *
     * @param 
     */
    public static void main(String[] args)
    {
        // Scanner used to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a password
        System.out.print("Enter a password: ");
        String password = sc.nextLine();

        // Evaluate the password strength criteria
        int score = CriteriaChecker.evaluateCriteria(password);
        String strength = CriteriaChecker.determineStrength(score);

        // Generate feedback based on missing criteria
        String feedback = FeedbackGenerator.generateFeedback(password);

        // Print a blank line for readability
        System.out.println();

        // Display the password strength and score
        System.out.println("Password Strength: " + strength + " (" + score + "/5)");

        // Display suggestions only when the password is weak
        if (score <= 1) {
            System.out.println("Suggestions to improve your password:");
            System.out.print(feedback);
        }

        
    }
}

