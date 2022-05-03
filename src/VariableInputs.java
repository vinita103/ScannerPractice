import java.util.Scanner;

/**
 * VariableInputs
 */
public class VariableInputs {

    public static void main(String[] args) {
        System.out.println("Enter a string of text:");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println("Enter an integer: ");
        int num = Integer.valueOf(input.nextLine());
        System.out.println("Enter a double: ");
        double num1 = Double.valueOf(input.nextLine());
        System.out.println("Enter a boolean value: ");
        boolean  text1  = Boolean.valueOf(input.nextLine());
        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + num);
        System.out.println("Your double is " + num1);
        System.out.println("Your boolean is " + text1);
    }
}