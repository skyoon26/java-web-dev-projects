package org.launchcode;

import java.util.Scanner;
public class AliceInWonderland {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the " +
                "bank, and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("Search for a term within the first sentence of Alice In Wonderland: ");
        String userWord = input.nextLine().toLowerCase();

        boolean isIncluded = firstSentence.toLowerCase().contains(userWord);
        System.out.println("Your result is: " + isIncluded);
    }
}
