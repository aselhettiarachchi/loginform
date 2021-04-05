package com.company;

import java.util.Scanner;

public class Main {

    private static String word = "terminator";
    private static String asterisk = new String(new char[word.length()]).replace("\0", "-");
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (count < 4 && asterisk.contains("-")) {
            System.out.println("Guess any letter in the word");
            System.out.println(asterisk);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    public static void hang(String guess) {
        String newasterisk = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '-') {
                newasterisk += word.charAt(i);
            } else {
                newasterisk += "-";
            }
        }

        if (asterisk.equals(newasterisk)) {
            count++;
            hangmanImage();
        } else {
            asterisk = newasterisk;
        }
        if (asterisk.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }
    }

    public static void hangmanImage() {
        if (count == 1) {
            System.out.println("Wrong guess, try again");

        }
        if (count == 2) {
            System.out.println("Wrong guess, try again");

        }
        if (count == 3) {
            System.out.println("Wrong guess, try again");

        }
    }
}