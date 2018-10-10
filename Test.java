package movies;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int seatsAvailable = 12;
		Seat[][] seats = new Seat[4][3];

		for (int row = 0; row < seats.length; row++) {
			for (int seat = 0; seat < seats[row].length; seat++) {

				seats[row][seat] = new Seat();
				seats[row][seat].getPrice();
			}
		}

		for (int row = 0; row < seats.length; row++) {
			for (int seat = 0; seat < seats.length; seat++) {

				System.out.println("How Many seats would you like to buy?");
				System.out.println("Enter 1-" + seatsAvailable);
				int seatsWanted = scan.nextInt();

			}

		}
	}
}
