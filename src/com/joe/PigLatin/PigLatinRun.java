package com.joe.PigLatin;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Joe Schlimmer
 * Pig Latin Translator Main Class
 */
public class PigLatinRun {
    public static void main (String[] args) {

        PigLatinTranslate translate = new PigLatinTranslate();
        translate.setPigLatinTranslate("Hello");
        System.out.println(translate.getPigLatinTranslate());

        Result testResult = JUnitCore.runClasses(PigLatinTests.class);

        System.out.println("");
        System.out.println("");
        System.out.println("Test Run: " + (testResult.wasSuccessful() ? "SUCCESS" : "FAILURE"));
        System.out.println("---------------");
        System.out.println("");

        for (Failure failure : testResult.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("");
        System.out.println("Tests run: " + testResult.getRunCount() + ", failures: " + testResult.getFailureCount());
    }
}
