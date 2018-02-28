import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.print("What is your first name? ");
        String name = input.next();
        System.out.print("Hi, " + name + "! Which do you choose? (O)dds or (E)vens? ");
        String choice = input.next();

        if (choice.equalsIgnoreCase("o")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("--------------------");
        System.out.print("How many \"fingers\" do you put out? ");
        int fingers = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays number " + computer);
        System.out.println("--------------------");
        int sum = fingers + computer;
        System.out.println("The total of " + fingers + " and " + computer + " is " + sum);
        if (sum % 2 == 0) {
            System.out.println("This is an even number!");
            if (fingers % 2 == 0) {
                System.out.println(name + " has won the game!!");
            } else {
                System.out.println("The computer has won. Better luck next time, loser.");
            }
        } else {
            System.out.println("This is an odd number!");
            if (fingers % 2 != 0) {
                System.out.println(name + " has won the game!!");
            } else {
                System.out.println("The computer has won. Better luck next time, loser.");
            }
        }
        System.out.println("--------------------");
    }
}