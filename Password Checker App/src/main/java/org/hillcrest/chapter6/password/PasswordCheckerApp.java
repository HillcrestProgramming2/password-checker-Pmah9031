package org.hillcrest.chapter6.password;

import java.util.Scanner;

public class PasswordCheckerApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = sc.nextLine();

        int score = CriteriaChecker.evaluateCriteria(password);
        String strength = CriteriaChecker.determineStrength(score);

        String feedback = FeedbackGenerator.generateFeedback(password);

        // Print strength + score
        System.out.println();
        System.out.println("Password Strength: " + strength + " (" + score + "/5)");

        // Only print suggestions if feedback is not empty AND not strong
        if (score <=1) {
            System.out.println("Suggestions to improve your password:");
            System.out.print(feedback);
        }


    }
}
