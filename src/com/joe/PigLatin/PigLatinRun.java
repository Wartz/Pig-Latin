package com.joe.PigLatin;

public class PigLatinRun {
    public static void main (String[] args) {
        PigLatinTranslate translate = new PigLatinTranslate();
        String out = PigLatinTranslate.translateToPL("Bob");
        System.out.println(out);
    }
}
