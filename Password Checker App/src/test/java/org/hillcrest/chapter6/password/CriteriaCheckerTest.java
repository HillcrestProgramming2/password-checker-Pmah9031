package org.hillcrest.chapter6.password;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CriteriaCheckerTest
{
    @Test
    public void testWeakPassword()
    {
        String password = "12345";
        int score = CriteriaChecker.evaluateCriteria(password);

        assertEquals(1, score);
        assertEquals("Weak", CriteriaChecker.determineStrength(score));
    }

    @Test
    public void testModeratePassword()
    {
        String password = "password123";
        int score = CriteriaChecker.evaluateCriteria(password);

        assertEquals(3, score);
        assertEquals("Moderate", CriteriaChecker.determineStrength(score));
    }

    @Test
    public void testStrongPassword()
    {
        String password = "Secure@2024";
        int score = CriteriaChecker.evaluateCriteria(password);

        assertEquals(5, score);
        assertEquals("Strong", CriteriaChecker.determineStrength(score));
    }

    @Test
    public void testMinimumLength()
    {
        String password = "Ab1@abcd";
        int score = CriteriaChecker.evaluateCriteria(password);

        assertEquals(5, score);
    }
}
