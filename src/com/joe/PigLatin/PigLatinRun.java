package com.joe.PigLatin;

/**
 * Created by Joe Schlimmer
 * Pig Latin Translator Main Class
 */

class PigLatinRun {
    public static void main (String[] args) {
        String text;

        PigLatinArguments input = new PigLatinArguments();
        input.setInput(args);
        text = input.getInput();

        PigLatinTranslate translate = new PigLatinTranslate();
        translate.setPigLatinTranslate(text);
        text = translate.getPigLatinTranslate();

        System.out.println(text);
    }
}
