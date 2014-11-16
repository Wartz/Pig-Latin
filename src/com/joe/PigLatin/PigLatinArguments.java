package com.joe.PigLatin;

/**
 * Created by joe on 11/16/14.
 */
class PigLatinArguments {
    private String inputString;
    private String[] input;

    private String ArgsToString() {
        StringBuilder builder = new StringBuilder();
        for(String s : input) {
            builder.append(s);
            builder.append(" ");
        }
        inputString = builder.toString();
        return inputString;
    }

    public void setInput(String[] input) {
        this.input = input;
    }

    public String getInput() {
        return this.ArgsToString();
    }
}
