package com.itjiangren.day1;

/**
 * Created by seabook on 14/8/17.
 * This is a java doc comments
 */
public interface Comments {

    /**
     * Print all the comments by specifying the line numbers
     * @param lineNo how many lines of comments need to be printed
     * @return true if the print is successful
     */
    boolean printComments(int lineNo);
}

class Main {

    /*
    This is the first line of a comment
    This is the second line of a comment
    // line comment
     */
    public void main(String[] args) {
        // This is a stand alone comment
        System.out.println("Hello World One"); // This is a comment
        //System.out.println("Hello World Two");
        System.out.println(/*"Hello World Three"*/"This is different text");
    }
}

