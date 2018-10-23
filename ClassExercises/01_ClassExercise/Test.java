package classex;

public class Test {

	public static IFly createIFly() {
		
		int a = (int)(Math.random() * 3 + 0);
		
		if (a == 0) {
			Bird s = new Bird(); 
			return s;
		}
		
		if (a == 1) {
			Plane p = new Plane();
			return p;
			
		}
		
		if (a == 2) {
			Kite k = new Kite();
			return k;
			
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		
		
		IFly[] flyArr = new IFly[10];
		
		for (int i = 0; i < flyArr.length; i++) {
			flyArr[i] = createIFly();
			System.out.println("-------------Created " + (i+1) + " Object-----------------");
			
			flyArr[i].Fly((int)(Math.random() * 100 + 1));
			
			flyArr[i].land();
			System.out.println();
		}
		
		
	}

}
