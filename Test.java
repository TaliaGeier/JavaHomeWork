package movies;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int seatsAvailable = 12;
		Seat[][] seats = new Seat[4][3];

		for (int row = 0; row < seats.length; row++) {
			for (int col = 0; col < seats[row].length; col++) {

				seats[row][col] = new Seat();
				seats[row][col].getPrice();
			}
		}
		System.out.println("How Many seats would you like to buy?");
		System.out.println("Enter 1-" + seatsAvailable);
		int seatsNumWant = scan.nextInt();

		System.out.println("Enter Row Number! (1-3)");
		int rowWanted = scan.nextInt();

		System.out.println("Enter Seat Number! (1-4)");
		int colWanted = scan.nextInt();

		// loop to get a number of tickets

		while (seatsNumWant > 0 && seatsNumWant < seatsAvailable) {

			if (seats[rowWanted][colWanted].getSeatStatus() == false) {

				seats[rowWanted][colWanted].changeSeatStatus();
				System.out.println("Ok Cool Seat - " + rowWanted + " " + colWanted + " is Yours!");
				seatsAvailable--;
				seatsNumWant--;
				if (seatsNumWant>0) {
					System.out.println("Enter Another Seat Row");
					rowWanted = scan.nextInt();
					System.out.println("Enter Seat Number! (1-4)");
					colWanted = scan.nextInt();
				}
			} else {
				System.out.println("ooo sorry this Seat is taken!");
			}
			

			scan.close();
		}
	}
}