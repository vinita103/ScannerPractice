// package ScannerPractice.src;

import java.util.Scanner;

/**
 * HelloThere
 */
public class HelloThere {

    public static void main(String[] args) {
        System.out.println("Hello there! How are you doing today?");
        Scanner input = new Scanner(System.in);
        String text1 = input.nextLine();
        // System.out.println(text1);
        System.out.println("Wow - Interesting! Tell me more!");
        String text2 = input.nextLine();
        // System.out.println(text2);
        System.out.println("Nice Chatting with you! Good Bye!");
    }

    
}