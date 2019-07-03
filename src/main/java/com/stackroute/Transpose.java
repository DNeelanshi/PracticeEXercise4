//4. Write a program to transpose the given string.
//        Input String : a quick brown fox jumps over the lazy dog
//        Output String: a kciuq nworb xof spmuj revo eht yzal god

package com.stackroute;

public class Transpose {

    public String transpose(String str){


        if(str==null){
            return null;
        }
        StringBuffer output = new StringBuffer("");

        for(String string:str.split(" ")){  //loop on input and check for each word then reverse it using STring Buffer.

            StringBuffer value = new StringBuffer(string);
            value.reverse();
            output.append(value).append(" ");  //appending space with every reversed value

        }

        return output.substring(0,output.length()-1);    //result

    }

}
