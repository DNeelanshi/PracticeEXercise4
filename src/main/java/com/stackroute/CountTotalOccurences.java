//1. Write a java program to count the total number of occurrences of a given character in a string
//        without using any loop?
//        For Example- Java is java again java again count number of occurrence of a in the given string

package com.stackroute;

public class CountTotalOccurences {
    private  char character;

    public int countoccurences(String str, char ch){

        this.character =ch;
        try {

            int lengthstring = str.trim().length();  ///length of str
            int lengthstring1 = str.trim().replaceAll(Character.toString(ch),"").length();  //length without character

            int count = lengthstring-lengthstring1; //difference in lengths
            return count;

        }catch (NullPointerException e){

            return 0;
        }




    }
}
