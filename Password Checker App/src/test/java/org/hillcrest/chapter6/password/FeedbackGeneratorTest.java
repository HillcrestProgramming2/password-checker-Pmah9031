package org.hillcrest.chapter6.password;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the FeedbackGenerator class.
 *
 * This class verifies that the correct feedback messages
 * are generated for weak, moderate, and strong passwords.
 */
public class FeedbackGeneratorTest
{
    /**
     * Tests feedback for a weak password that fails
     * multiple password criteria.
     */
    @Test
    public void testWeakPasswordFeedback()
    {
        String password = "12345";
        String feedback = FeedbackGenerator.generateFeedback(password);

        // Weak password should include multiple improvement suggestions
        assertTrue(feedback.contains("Increase the length"));
        assertTrue(feedback.contains("uppercase"));
        assertTrue(feedback.contains("lowercase"));
        assertTrue(feedback.contains("special character"));
    }

    /**
     * Tests feedback for a moderate password that is missing
     * an uppercase letter and a special character.
     */
    @Test
    public void testModeratePasswordFeedback()
    {
        String password = "password123";
        String feedback = FeedbackGenerator.generateFeedback(password);

        // Should suggest adding uppercase and special characters
        assertTrue(feedback.contains("uppercase"));
        assertTrue(feedback.contains("special character"));

        // Should NOT suggest criteria that are already met
        assertFalse(feedback.contains("lowercase"));
        assertFalse(feedback.contains("number"));
    }

    /**
     * Tests feedback for a strong password.
     * Strong passwords should not return improvement suggestions.
     */
    @Test
    public void testStrongPasswordFeedback()
    {
        String password = "Secure@2024";
        String feedback = FeedbackGenerator.generateFeedback(password);

        // Strong passwords should return no suggestions
        // or a simple confirmation message
        assertTrue(feedback.isEmpty() || feedback.contains("strong"));
    }

    /**
     * Tests that feedback for weak passwords
     * contains multiple lines of suggestions.
     */
    @Test
    public void testFeedbackHasMultipleLines()
    {
        String password = "abc";
        String feedback = FeedbackGenerator.generateFeedback(password);

        // Feedback should contain line breaks between suggestions
        assertTrue(feedback.contains("\n"));
    }
}
