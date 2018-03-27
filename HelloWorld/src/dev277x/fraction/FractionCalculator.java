import java.util.*;

// too lazy to finish the fraction calculator for now 3/27/2018
public class FractionCalculator {
    public static void main(String[] args) {
        // intro
        System.out.println("This program is a fraction calculator");
        System.out.println("It will add, subtract, multiply, and divide fractions until you type Q to quit.");
        System.out.println("Please enter your fractions in the form a/b, where a and b are integers.");
        lineBreak();

        // operation input and check
        System.out.print("Please enter an operation (+, -, /, *, =, or Q to quit): ");
        Scanner input = new Scanner(System.in);
        input = input.next();
        getOperation(input);

        // fraction input and check
        System.out.print("Please enter a fraction (a/b) or integer (a): ");
        String fraction = input.nextLine();
        while (validFraction(fraction) != true) {
            System.out.print("Invalid fraction. Please enter (a/b) or (a), where a and b are integers and b is not zero: ");
            input = input.next();
        }
    }

    public static String getOperation(Scanner input) {
        while ((input != "+") || (input != "-") || (input != "/") || (input != "*") || (input != "=") || (input.equalsIgnoreCase("q") == false)) {
           System.out.print("Invalid input (+, -, /, *, =, or Q to quit): ");
           input = input.next();
        }
        return input;
    }

    public static boolean validFraction(String input) {
        if ((input.length() == 3) && (input.get(1) == "/")) {
            int a = input.get(0);
            int b = input.get(2);
            return true;
        } else {
            return false;
        }
    }

    public static Fraction getFraction(Scanner input) {

    }

    public static void lineBreak() {
        System.out.println("-----------------------------------------------------------------------------");
    }
}