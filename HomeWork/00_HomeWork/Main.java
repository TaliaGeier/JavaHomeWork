package hw;

public class Main {

	public static void main(String[] args) {
		// To get Random
		// ( Math.random() * ( max-Min ))+ Min!
		
		for (int i = 0; i < 5; i++) {
			Pizza[] pizzArr = new Pizza[5];
			Pizza s = new Pizza((int)(Math.random() * ( 50 - 10 )) + 10, (int)(Math.random() * ( 8 - 1 )) + 1 , (int)(Math.random() * ( 5 - 0 )) + 0 );
			pizzArr[i] = s;
			pizzArr[i].print();
			System.out.println(pizzArr[i].isBasicPizza());
			System.out.println(pizzArr[i].getToppingsNum());
			
		}

	}

}
