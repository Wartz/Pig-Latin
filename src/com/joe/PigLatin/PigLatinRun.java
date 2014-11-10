package com.joe.PigLatin;


/**
 * Created by Joe Schlimmer
 * Pig Latin Translator Main Class
 */

public class PigLatinRun {
    public static void main (String[] args) {

        PigLatinTranslate translate = new PigLatinTranslate();
        translate.setPigLatinTranslate("Hello");
        System.out.println(translate.getPigLatinTranslate());

        PigLatinTestsRun runTests = new PigLatinTestsRun();
        runTests.run();
    }
}
