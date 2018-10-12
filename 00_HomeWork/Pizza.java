package hw;

public class Pizza {

	private int diameter, slices, toppingsNum;

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		if (diameter > 10 && diameter < 50)
			this.diameter = diameter;
		else {
			System.out.println("Enter Another diameter!");
		}
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		if (slices > 1 && slices < 8)
			this.slices = slices;
		else {
			System.out.println("Enter another slices number!");
		}
	}

	public int getToppingsNum() {
		return toppingsNum;
	}

	public void setToppingsNum(int toppingsNum) {
		this.toppingsNum = toppingsNum;
	}

	public boolean isBasicPizza() {
		if (getToppingsNum() > 0)
			return false;
		else {
			return true;
		}
	}

	public Pizza(int diameter, int slices, int toppingsNum) {
		super();
		this.diameter = diameter;
		this.slices = slices;
		this.toppingsNum = toppingsNum;
	}

	public void print() {
		System.out.println("-------------");
		System.out.println("Pizza ordered : " + "\n diameter is : " + diameter + "\n slices cut : " + slices
				+ "\n toppings asked " + toppingsNum);
		System.out.println("-------------");

	}

}
