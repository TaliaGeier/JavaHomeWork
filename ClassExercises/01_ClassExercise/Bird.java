package classex;

public class Bird implements IFly {

	
	private String birdType;
	private int birdAge;
	private String birdColor;
	
	
	
	@Override
	public int Fly(int speed) {
		System.out.println("The Bird is Flying at " + speed + "MPH");
		return 0;
	}
	
	
	@Override
	public Boolean land() {
		System.out.println("The bird has successfully landed!");
		return true;
	}
	
	
}
