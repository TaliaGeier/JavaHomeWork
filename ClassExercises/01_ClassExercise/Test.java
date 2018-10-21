package classex;

public class Test {

	public static IFly createIFly() {
		
		int a = (int)(Math.random() * (2-0) + 0);
		
		if (a == 0) {
			Bird s = new Bird(); 
			return s;
		}
		
		if (a == 1) {
			Plane p = new Plane();
			return p;
			
		}
		
		if (a == 3) {
			Kite k = new Kite();
			return k;
			
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		
		
		IFly[] flyArr = new IFly[10];
		
		for (int i = 0; i < flyArr.length; i++) {
			flyArr[i] = createIFly();
			System.out.println("-------------Created " + i + " Object-----------------");
			flyArr[i].Fly(10);
			flyArr[i].land();
		}
		
	}

}
