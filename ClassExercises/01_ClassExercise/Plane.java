package classex;

public class Plane implements IFly{
	
	
	private String planeName;
	private String planeCompany;
	private String destination;
	
	
	@Override
	public int Fly(int speed) {
		System.out.println("Plane is Flying OMG@#!$" + "\n" + "THE SPEED IS " + speed);
		return 0;
	}
	
	
	@Override
	public Boolean land() {
		System.out.println("The Plane successfully landed!");
		return true;
	}
	
	
	
	

}
