// package ScannerPractice.src;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) throws Exception {
        System.out.println("What's your name?");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println("Hi " + text);
    }
}
