import java.util.Scanner;

public class TripPlanner {
	public static void main(String[] args) {
		greetings();
		pageBreak();
		travelTimeBudget();
		pageBreak();
	}
	public static void greetings() {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Vacation Planner!");
		System.out.print("What is your first and last name? ");
		String name = input.nextLine();
		System.out.print("Nice to meet you " + name + ", where are you traveling to? ");
		String city = input.nextLine();
		System.out.print("Great! " + city + " sounds like a great trip");
	}
	public static void pageBreak() {
		System.out.println("");
		System.out.println("**********");
		System.out.println("");
	}
	public static void travelTimeBudget() {
		Scanner input = new Scanner(System.in);
		System.out.print("How many days are you going to spend traveling? ");
		int travelDays = input.nextInt();
		System.out.print("How much money, in USD, are you planning to spend on your trip? ");
		int budget = input.nextInt();
		System.out.print("What is the three letter currency symbol for your travel destination? ");
		String foreignCurrency = input.next();
		System.out.print("How many " + foreignCurrency + " are there in 1 USD? ");
		double exchangeRate = input.nextDouble();
		System.out.println("");
		System.out.println("If you are traveling for " + travelDays + " days that is the same as " + (travelDays * 24) + " hours or " + (travelDays * 24 * 60) + " minutes");
		System.out.println("If you are going to spend $" + budget + " USD that means per day you can spend up to $" + (budget / travelDays) + " USD");
		System.out.print("Your total budget in " + foreignCurrency + " is " + (budget * exchangeRate) + " " + foreignCurrency + ", which per day is " + ((budget * exchangeRate) / travelDays) + " " + foreignCurrency);
	}
}