package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill costumer = new Bill();

		System.out.print("Gender: ");
		costumer.gender = sc.next().charAt(0);
		System.out.print("Number of beers: ");
		costumer.beer = sc.nextInt();
		System.out.print("Amount of soft drinks: ");
		costumer.softDrink = sc.nextInt();
		System.out.print("Number of barbecues:");
		costumer.barbecue = sc.nextInt();

		System.out.println();

		System.out.println("REPORT:");
		System.out.printf("Consumption = R$ %.2f%n", costumer.feeding());

		if (costumer.couvert() == 0) {
			System.out.printf("No cover charge%n");
		} else {
			System.out.printf("Couvert = R$ %.2f%n", costumer.couvert());
		}

		System.out.printf("Ticket = R$ %.2f%n", costumer.ticket());

		System.out.println();

		System.out.printf("Amount payable = R$ %.2f%n", costumer.total());

		sc.close();

	}

}
