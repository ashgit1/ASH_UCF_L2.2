package com.ashish.parsingtoken;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * Counts the number of times the word "cat" appears in the input string.
 * This example uses word boundaries(\b) to ensure that the letters "c" "a" "t" are not merely a substring in a longer word.
 * The find() finds the next subsequence of the input sequence that matches the pattern.
 * The start() method returns the start index of the subsequence.
 * The end() returns the index of the last character matched, plus one.
*/
public class RegExp1
{
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT ="cat cat cat cattie cat";

    public static void main( String args[] ){
       Pattern p = Pattern.compile(REGEX);
       Matcher m = p.matcher(INPUT); // get a matcher object
       int count = 0;

       while(m.find()) {
         count++;
         System.out.println("Match number: " + count);
         System.out.println("start(): " + m.start());
         System.out.println("end(): " + m.end());
      }
   }
}