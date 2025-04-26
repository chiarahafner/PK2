package a3;

import java.util.Scanner;

public class PizzaDeluxe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] toppings = { "Salami", "Pineapple", "Cheese", "Spinach", "Garlic" };
		double[] prices = { 1.0, 1.5, 1.0, 0.8, 0.5 };
		System.out.println("Welcome to Pizza Deluxe!");
		// Print all toppings with their prizes
		System.out.print("Choose your toppings (e.g., 1 3 4): ");
		String input = scanner.nextLine();
		String[] choices = input.split(" ");
//Interpret all entries in choices as integer
//Look up the prices and add them up
//Look up the toppings / combinations for a funny message
//Print the total price and the funny message
	}
}