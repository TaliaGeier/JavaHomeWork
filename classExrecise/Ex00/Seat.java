package movies;

import java.util.Random;

public class Seat {
	Random rand = new Random();
	private int price;
	private Boolean seatStatus;

	public Seat() {
		super();
		int min = 70;
		int max = 90;
		this.price = rand.nextInt(max - min) + 50;
		this.seatStatus = false;
	}

	public int getPrice() {
		return price;
	}


	public Boolean getSeatStatus() {
		return seatStatus;
	}

	public void setSeatStatus(Boolean seatStatus) {
		this.seatStatus = seatStatus;
	}

	public void changeSeatStatus() {
		this.seatStatus = true;

			
	}


}
