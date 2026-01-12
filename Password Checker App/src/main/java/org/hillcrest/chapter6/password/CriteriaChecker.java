package org.hillcrest.chapter6.password;


public class CriteriaChecker
{
   public static int evaluateCriteria(String password)
   {
       int score = 0;


       boolean hasUpperCase = false;
       boolean hasLowerCase = false;
       boolean hasDigit = false;
       boolean hasSpecialChar = false;


       String specialCharacters = "!@#$%^&*()-_=+|[]{};:/?.";




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
           if (Character.isDigit(ch)) {
               hasDigit = true;
           }


           for (int j = 0; j < specialCharacters.length(); j++)
               if (ch == specialCharacters.charAt((j))) {
                   hasSpecialChar = true;
           }
       }


       if (hasUpperCase) score++;
       if (hasLowerCase) score++;
       if (hasDigit) score++;
       if (hasSpecialChar) score++;


       return score;
   }
