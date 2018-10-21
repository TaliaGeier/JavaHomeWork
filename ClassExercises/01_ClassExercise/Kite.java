package classex;

public class Kite implements IFly{
	
	private String color;
	private int price;
	
	
	@Override
	public int Fly(int speed) {
		System.out.println("The Kite is Flying at " + speed + " MPH");
		return 0;
	}
	
	
	@Override
	public Boolean land() {
		System.out.println("The Kite has successfully landed!");
		return true;
	}
	
	

}
