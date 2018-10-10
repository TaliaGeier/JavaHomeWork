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
				System.out.println(seats[row][seat].getPrice());
			}
		}

		for (int row = 0; row < seats.length; row++) {
			for (int seat = 0; seat < seats.length; seat++) {

				System.out.println("How Many seats would you like to buy?");
				System.out.println("Enter 1-" + seatsAvailable);
				int seatsWanted = scan.nextInt();
				while (seatsWanted > 1) {
					seatsAvailable = seatsAvailable - seatsWanted;
					System.out.println("Enter A row between 1-3");
					int rowChoice = scan.nextInt();
					System.out.println("Enter A seat between 1-4");
					int seatChoice = scan.nextInt();

					if (seats[rowChoice][seatChoice].getSeatStatus() == false) {
						seats[rowChoice][seatChoice].setSeatStatus(true);
					}
				}
				seatsAvailable--;
			}
		}
		for (int i = 0; i < seats.length; i++) {

			for (int j = 0; j < seats.length; j++) {
				if (seats[i][j].getSeatStatus() == false) {

				}

			}

		}

	}

}
