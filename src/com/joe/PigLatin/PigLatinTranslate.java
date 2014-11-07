package com.joe.PigLatin;

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

            /*TODO: Strip out punctuation and move it to the end of the phrase after parsing*/
            /*TODO: Use regex to check for words that start with vowels to add "way" instead of "ay" at the end.*/

            //Translates a word by moving the first character of the word to the end and then adding "ay".
            parts += words[i].substring(2) + words[i].substring(0,1).toLowerCase() + "ay" + (i < words.length-1 ? " " : "");
            result += parts;
        }

        /*TODO: Look into figuring out how to capitalize proper nouns, etc*/
        //Formats a word or phrase to be capitalized.
        result = result.substring(0,1).toUpperCase() + result.substring(1).toLowerCase();

        return result;
    }
}

