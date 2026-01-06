package org.hillcrest.chapter6.password;



public class CriteriaCheckerTest
{
    public static int evaluateCriteria(String password)
    {
        int score =5

        String specialCharacters = "!@#$%^&*()-_=+|[]{};:/?.";
        for(int i = 0; i < password.length();i++) {
            char ch = password.charAt(i);

            if (password.length() > 8);
            {
                score++;
            }
            if(Character.isUpperCase(ch)){
                score++;
            }
            if(Character.isLowerCase(ch)){
                score++;
            }
            if(Character.isDigit(ch)){
                score++;
            }
            for (int j = 0; j <specialCharacters.length(); j++)
                if(ch == specialCharacters.charAt((j))



        }

    }

}
