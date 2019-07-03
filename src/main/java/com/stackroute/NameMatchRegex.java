//5. Write a program with the implementation of Regular Expression to find the presence of the name
//        Harry in a string.
//        Input: This is Harry.
//        Output: Is Harry here ? true
//        Input : This is Henry.
//        Output: Is Harry here ? False


package com.stackroute;

public class NameMatchRegex {

    public boolean namematching(String str){

        try {
            return str.matches("(?i).*Harry.*");   //return true or false on matching or not.
        } catch (NullPointerException e){   //null values expection
            return false;
        }

    }

}
