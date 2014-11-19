package com.joe.PigLatin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by joe on 11/16/14.
 */
class PigLatinFormatText {
    private String text;

    public void setFormattedText(String t) {
        this.text = t;
    }

    public String getFormattedText() {
        return this.formatText(text);
    }

    private String formatText(String text) {
        /*TODO: Look into figuring out how to capitalize proper nouns, etc*/
        text = this.formatPunctuation(text);
        text = this.formatCapitalization(text);

        return text;
    }

    private String formatPunctuation(String text) {
        String[] words = text.split(" ");
        Pattern pattern = Pattern.compile("\\p{Punct}");

        for (int i = 0; i < words.length; i++) {
            String swap = "";
            Matcher matcher = pattern.matcher(words[i]);
                if (matcher.find()) {
                   swap = words[i].substring(matcher.start());
                }
        }
        return text;
    }

    private String formatCapitalization(String text) {
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(words[i].toUpperCase()))
                text += words[i].toUpperCase();
        }
        return text;
    }
}
