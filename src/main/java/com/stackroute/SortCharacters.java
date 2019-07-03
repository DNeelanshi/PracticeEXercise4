
//3. Write a program that sets up a String variable containing a paragraph of text of your choice.
//        a. Extract the words from the text and sort them into alphabetical order.
//        b. Display the sorted list of words.

package com.stackroute;

import java.util.Arrays;

public class SortCharacters {

            public String[] sortWordsInParagraph(String paragraph){

                if(paragraph == null){
                    return null;
                }
                try {
                    String[] str = paragraph.split(" ");
                    String temp;
                    for (int i=0; i<str.length-1;i++){        //2loops on paragraph and compare each word using compareToIgnoreCase()
                        for(int j=i+1;j<str.length;j++){
                            if(str[i].compareToIgnoreCase(str[j]) > 0){
                                temp =str[i];
                                str[i] = str[j];
                                str[j]= temp;
                            }
                        }

                    }
                    if(str.length >=1){     //condition to check if returned atring array is not empty. its null
                        return str;
                    }else{
                        return null;
                    }
                } catch (NullPointerException e){     //exception for spaces
                    return null;
                }



            }
}
