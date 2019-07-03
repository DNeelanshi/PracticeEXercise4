//2. Write a program to replace all d with f and all l with t in the given String
//        Input: daily dry
//        Output: faity fry
//        Original string: daily dry
//        New String: faity fry

package com.stackroute;

public class ReplaceCharacters {


    public String replacechar(String str){

        String result="";
        String finalresult="";

        try {
            //check for occurence of d and i
            if(str.contains("d")){
                result =  str.replaceAll("d","f");

                if(str.contains("l")){
                    finalresult = result.replaceAll("l","t");
                }
            }else{
                finalresult = str;
            }
           //check for occurence of i and
            if(str.contains("l")){
                result = str.replaceAll("l","t");

                if(str.contains("d")){
                    finalresult = result.replaceAll("d","f");
                }
            }else {
                finalresult = str;
            }

               if(finalresult.length() >1){
                   return  finalresult;
               }else {
                   return null;
               }

        }catch (NullPointerException e){   //check for space values or nul values

            return e.getMessage();
        }

    }
}
