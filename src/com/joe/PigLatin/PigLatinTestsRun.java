package com.joe.PigLatin;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Joseph on 11/10/2014.
 * com.joe.PigLatin
 * Pig Latin Translator Test Runner Class
 */
public class PigLatinTestsRun {
    public void run() {
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
