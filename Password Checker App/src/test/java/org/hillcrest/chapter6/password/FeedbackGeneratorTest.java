package org.hillcrest.chapter6.password;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD
public class FeedbackGeneratorTest
{
    @Test
    public void testWeakPasswordFeedback()
    {
        String password = "12345";
        String feedback = FeedbackGenerator.generateFeedback(password);

        assertTrue(feedback.contains("Increase the length"));
        assertTrue(feedback.contains("uppercase"));
        assertTrue(feedback.contains("lowercase"));
        assertTrue(feedback.contains("special character"));
    }

    @Test
    public void testModeratePasswordFeedback()
    {
        String password = "password123";
        String feedback = FeedbackGenerator.generateFeedback(password);

        assertTrue(feedback.contains("uppercase"));
        assertTrue(feedback.contains("special character"));
        assertFalse(feedback.contains("lowercase"));
        assertFalse(feedback.contains("number"));
    }

    @Test
    public void testStrongPasswordFeedback()
    {
        String password = "Secure@2024";
        String feedback = FeedbackGenerator.generateFeedback(password);

        // Strong passwords should return NO suggestions
        assertTrue(feedback.isEmpty() || feedback.contains("strong"));
    }

    @Test
    public void testFeedbackHasMultipleLines()
    {
        String password = "abc";
        String feedback = FeedbackGenerator.generateFeedback(password);

        assertTrue(feedback.contains("\n"));
    }
=======

public class FeedbackGeneratorTest
{
   @Test
   public void testWeakPasswordFeedback()
   {
       String password = "12345";
       String feedback = FeedbackGenerator.generateFeedback(password);


       assertTrue(feedback.contains("Increase the length"));
       assertTrue(feedback.contains("uppercase"));
       assertTrue(feedback.contains("lowercase"));
       assertTrue(feedback.contains("special character"));
   }


   @Test
   public void testModeratePasswordFeedback()
   {
       String password = "password123";
       String feedback = FeedbackGenerator.generateFeedback(password);


       assertTrue(feedback.contains("uppercase"));
       assertTrue(feedback.contains("special character"));
       assertFalse(feedback.contains("lowercase"));
       assertFalse(feedback.contains("number"));
   }


   @Test
   public void testStrongPasswordFeedback()
   {
       String password = "Secure@2024";
       String feedback = FeedbackGenerator.generateFeedback(password);


       // Strong passwords should return NO suggestions
       assertTrue(feedback.isEmpty() || feedback.contains("strong"));
   }


   @Test
   public void testFeedbackHasMultipleLines()
   {
       String password = "abc";
       String feedback = FeedbackGenerator.generateFeedback(password);


       assertTrue(feedback.contains("\n"));
   }
>>>>>>> 231e96834a115a12ec0d3b6ca566fbfc666e52b1
}
