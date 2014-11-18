package com.joe.PigLatin;

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
        text = text.substring(0,1).toUpperCase() + text.substring(1).toLowerCase();
        text = this.formatPunctuation(text);
        return text;
    }

    private String formatPunctuation(String text) {
        String pattern = "\\p{Punct}";
        return  text.replaceAll(pattern, "");
    }

    private String formatCapitalization(String text) {
        for (int i = 0; 0 < text.length(); i++) {

        }
        return text;
    }
}
