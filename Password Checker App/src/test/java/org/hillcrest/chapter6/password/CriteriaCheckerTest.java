package org.hillcrest.chapter6.password;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the CriteriaChecker class.
 * 
 * This class verifies that password scoring and strength determination
 * behave correctly for weak, moderate, and strong passwords.
 */
public class CriteriaCheckerTest
{
    /**
     * Tests a weak password that only contains digits
     * and does not meet most password criteria.
     */
    @Test
    public void testWeakPassword()
    {
        String password = "12345";
        int score = CriteriaChecker.evaluateCriteria(password);

        // Only digit criterion should be met
        assertEquals(1, score);
        assertEquals("Weak", CriteriaChecker.determineStrength(score));
    }

    /**
     * Tests a moderate password that meets some,
     * but not all, password criteria.
     */
    @Test
    public void testModeratePassword()
    {
        String password = "password123";
        int score = CriteriaChecker.evaluateCriteria(password);

        // Meets length, lowercase, and digit criteria
        assertEquals(3, score);
        assertEquals("Moderate", CriteriaChecker.determineStrength(score));
    }

    /**
     * Tests a strong password that satisfies
     * all password criteria.
     */
    @Test
    public void testStrongPassword()
    {
        String password = "Secure@2024";
        int score = CriteriaChecker.evaluateCriteria(password);

        // Meets all five criteria
        assertEquals(5, score);
        assertEquals("Strong", CriteriaChecker.determineStrength(score));
    }

    /**
     * Tests a password that meets the minimum length requirement
     * and satisfies all other criteria.
     */
    @Test
    public void testMinimumLength()
    {
        String password = "Ab1@abcd";
        int score = CriteriaChecker.evaluateCriteria(password);

        // Password meets all criteria including minimum length
        assertEquals(5, score);
    }
}

