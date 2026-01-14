package org.hillcrest.chapter6.password;

/**
 * Utility class that generates feedback for improving a password.
 *
 * This class analyzes a password and returns a single feedback string
 * containing suggestions for any missing strength criteria.
 *
 * All methods are static because this class is not meant to be instantiated.
 */
public class FeedbackGenerator
{
    /**
     * Generates feedback based on which password strength criteria are not met.
     *
     * If the password is missing any required elements, this method builds
     * a feedback string using string concatenation and line breaks.
     * If the password meets all criteria, a positive message is returned.
     *
     * @param password the password entered by the user
     * @return a feedback string containing suggestions or a strong-password message
     */
    public static String generateFeedback(String password)
    {
        // Stores the feedback message that will be returned
        String feedback = "";

        // Flags to track which criteria are met
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        // List of allowed special characters
        String specialCharacters = "!@#$%^&*()-+=";

        // Check if the password meets the minimum length requirement
        if (password.length() < 8) {
            feedback += "Increase the length to at least 8 characters.\n";
        }

        // Loop through each character in the password
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Check for uppercase letters
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }
            // Check for lowercase letters
            else if (Character.isLowerCase(ch)) {
                hasLower = true;
            }
            // Check for digits
            else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            // Check for special characters
            else if (specialCharacters.indexOf(ch) != -1) {
                hasSpecial = true;
            }
        }

        // Add feedback for any missing criteria
        if (!hasUpper) {
            feedback += "Add at least one uppercase letter.\n";
        }
        if (!hasLower) {
            feedback += "Add at least one lowercase letter.\n";
        }
        if (!hasDigit) {
            feedback += "Add at least one number.\n";
        }
        if (!hasSpecial) {
            feedback += "Include at least one special character.\n";
        }

        // If no feedback was added, the password meets all criteria
        if (feedback.equals("")) {
            feedback = "Your password is strong.";
        }

        return feedback;
    }
}
