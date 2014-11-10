package com.joe.PigLatin;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Joseph on 11/7/2014.
 * Pig Latin Translator Test Class
 */
public class PigLatinTests {
    PigLatinTranslate test = new PigLatinTranslate();

    @Test
    public void testBasic() {
        test.setPigLatinTranslate("Hello");
        assertEquals("Ellohay", test.getPigLatinTranslate());
    }

    @Test
    public void testStartsWithVowel() {
        test.setPigLatinTranslate("Apple");
        assertEquals("Appleway", test.getPigLatinTranslate());
    }

    @Test
    public void testSentence() {
        test.setPigLatinTranslate("Hello world");
        assertEquals("Ellohay orldway", test.getPigLatinTranslate());
    }

    @Test
    public void testCapitalized() {
        test.setPigLatinTranslate("Joe Schlimmer");
        assertEquals("Oejay Chlimmersay", test.getPigLatinTranslate());
    }

    @Test
    public void testEmpty() {
        test.setPigLatinTranslate("");
        assertEquals("You wrote nothing", test.getPigLatinTranslate());
    }

    @Test
    public void testNumber() {
        test.setPigLatinTranslate("1");
        assertEquals("You wrote a number, not a word or phrase", test.getPigLatinTranslate());
    }

    @Test
    public void testPunctuation() {
        test.setPigLatinTranslate("!@#");
        assertEquals("You wrote punctuation, not a word", test.getPigLatinTranslate());
    }
}
