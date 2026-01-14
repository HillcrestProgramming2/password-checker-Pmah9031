package org.hillcrest.chapter6.password;


/**
 * Utility class that checks a password against specific strength criteria.
 *
 * This class evaluates a password based on length, uppercase letters,
 * lowercase letters, digits, and special characters.
 *
 * All methods are static because this class is not meant to be instantiated.
 */

public class CriteriaChecker
{
    /**
     * Evaluates a password against five strength criteria and returns a score.
     *
     * Criteria checked:
     * - At least 8 characters long
     * - Contains at least one uppercase letter
     * - Contains at least one lowercase letter
     * - Contains at least one digit
     * - Contains at least one special character
     *
     * @param password the password entered by the user
     * @return a score from 0 to 5 representing how many criteria are met
     */
    public static int evaluateCriteria(String password)
    {



        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Tracks the total number of criteria met
        int score = 0;


        
        // List of allowed special characters
        String specialCharacters = "!@#$%^&*()-_=+|[]{};:/?.";




        // Check password length (only needs to be checked once)

        if (password.length() >= 8) {
            score++;
        }



        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }
=======
        // Loop through each character in the password
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Check for uppercase letters
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }

            // Check for lowercase letters
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }

            // Check for digits

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }


            for (int j = 0; j < specialCharacters.length(); j++)
                if (ch == specialCharacters.charAt((j))) {
                    hasSpecialChar = true;
            }
        }


            // Check for special characters using a loop
            for (int j = 0; j < specialCharacters.length(); j++) {
                if (ch == specialCharacters.charAt(j)) {
                    hasSpecialChar = true;
                }
            }
        }

        // Add to score for each criterion that was met

        if (hasUpperCase) score++;
        if (hasLowerCase) score++;
        if (hasDigit) score++;
        if (hasSpecialChar) score++;


        return score;
    }





    /**
     * Determines the overall strength of a password based on its score.
     *
     * @param score the number of criteria met (0–5)
     * @return "Weak" for scores 0–2, "Moderate" for 3, and "Strong" for 4–5
     */

    public static String determineStrength(int score)
    {
        if (score <= 2) {
            return "Weak";
        } else if (score == 3) {
            return "Moderate";
        } else {
            return "Strong";
        }
    }
}



