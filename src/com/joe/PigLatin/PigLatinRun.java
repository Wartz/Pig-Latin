package com.joe.PigLatin;

/**
 * Created by Joe Schlimmer
 * Pig Latin Translator Main Class
 */

class PigLatinRun {
    public static void main (String[] args) {
        PigLatinTranslate translate = new PigLatinTranslate();
        translate.setPigLatinTranslate("hello nerds, how are you");
        System.out.println(translate.getPigLatinTranslate());
    }
}
