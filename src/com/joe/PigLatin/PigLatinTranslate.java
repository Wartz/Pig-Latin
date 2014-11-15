package com.joe.PigLatin;

/**
 * Created by Joseph on 11/7/2014.
 * Pig Latin Translator Core Class
 */

class PigLatinTranslate
{
    private String phrase;

    /**
     * @param p is the word(s) or phrase to translate into Pig Latin.
     */
    public void setPigLatinTranslate(String p) {
        this.phrase = p;
    }

    /**
     * @return English words/phrase translated into Pig Latin.
     */
    public String getPigLatinTranslate() {
        return this.translateToPL(phrase);
    }

    /**
     * @param text is the translated text to be formatted with capitalization/punctuation, etc
     * @return a capitalized/punctuated word or phrase.
     */
    private String formatText(String text) {
        /*TODO: Look into figuring out how to capitalize proper nouns, etc*/
        text = text.substring(0,1).toUpperCase() + text.substring(1).toLowerCase();
        text = this.formatPunctuation(text);
        return text;
    }

    private String formatPunctuation(String text) {
        String pattern = "\\p{Punct}";
        text = text.replaceAll(pattern, "");
        return text;
    }

    private Boolean isNotEmpty(String text) {
        return (text != null && text.length() > 0);
    }

    /**
     * @param phrase is the English word/phrase to be translated.
     * @return English words/phrase translated into Pig Latin.
     */
    private String translateToPL(String phrase) {
        String[] words = phrase.split(" ");
        String result = "";


        if (!isNotEmpty(phrase)) {
            result = "You wrote nothing";
            return result;
        }

        for(int i=0; i < words.length; i++) {
            String parts = "";

            if (words[i].toLowerCase().equals(words[i])) {
                try {
                    parts += words[i].substring(1,2);
                } catch(StringIndexOutOfBoundsException e) {
                    result = ("You wrote nothing");
                    return result;
                }
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

        result = this.formatText(result);

        return result;
    }
}

