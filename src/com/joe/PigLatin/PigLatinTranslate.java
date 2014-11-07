package com.joe.PigLatin;
import java.util.*;

/**
 * Created by Joseph on 11/7/2014.
 */
class PigLatinTranslate
{
    public static String translateToPL(String phrase) {
        String[] words = phrase.split(" ");
        String result = "";
        
        for(int i=0; i < words.length; i++) {
            String parts = "";
            
            if (words[i].toLowerCase().equals(words[i])) {
                parts += words[i].substring(1,2);
            }
            else {
                parts += words[i].substring(1,2).toUpperCase();
            }
            
            parts += words[i].substring(2) + words[i].substring(0,1).toLowerCase() + "ay" + (i < words.length-1 ? " " : "");
            result += parts;
        }
        return result;
    }
}

