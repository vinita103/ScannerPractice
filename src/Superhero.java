// package ScannerPractice.src;

import java.util.Scanner;

/**
 * Superhero
 */
public class Superhero {

    public static void main(String[] args) {
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        Scanner input = new Scanner (System.in);
        String text1 = input.nextLine();
        System.out.println("What is their superpower?");
        String text2 = input.nextLine();
        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named  " + text1 + ", who had the power of  " + text2);
        System.out.println("As they grew older," + text1 + " saw that the world needed them.");
        System.out.println( text1 + " used their ability to " + text2 + " to save the world.");
    }
}