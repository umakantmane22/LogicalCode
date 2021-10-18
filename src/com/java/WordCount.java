package com.java;

public class WordCount {

	public static void main(String[] args) {
		// Given String str
        String str =
          "One two       three\n four\tfive ";
         
        // Print the result
        System.out.println("No of words : " +
           countWords(str));

	}
	// Function to count total number
    // of words in the string
    public static int
      countWords(String str)
    {
         
        // Check if the string is null
        // or empty then return zero
        if (str == null || str.isEmpty())
            return 0;
         
        // Splitting the string around
        // matches of the given regular
        // expression
        String[] words = str.split("\\s+");
         
        // Return number of words
        // in the given string
        return words.length;
    }

}
