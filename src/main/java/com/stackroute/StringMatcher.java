
//6. Write a program to find out the multiple occurrences of the given word in a string using Matcher
//        methods.
//        Input : She sells seashells by the seashore
//        Given word: se
//        Output :
//        Found at: 4 - 6
//
//        Found at: 10 - 12
//        Found at: 27 – 29
package com.stackroute;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {

    public String matching(String inputstr,String choice){

        try {
            if(inputstr == null){
                return null;
            }else{
                StringBuffer stringBuffer=new StringBuffer();

                Pattern pattern=Pattern.compile(choice,Pattern.CASE_INSENSITIVE);   //pattern to convert choice of word into matchable pattern

                Matcher matcher=pattern.matcher(inputstr);  //matchers matches pattern with input string

                while (matcher.find()){

                    //matcher.find() will findd he required pattern in string , matcher.start() and end() will give index.

                    stringBuffer.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
                }

//                System.out.println(stringBuffer.toString().trim().length());
                if(stringBuffer.toString().trim().length() >=1){     // condition to avoid empty result
                    return stringBuffer.toString().trim();
                }else{
                    return null;
                }
            }
        }catch (NullPointerException e){    //expection for null values
            return null;
        }


    }
}