
public class HWone {

	public static void main(String[] args) {
		System.out.println(divide("stringtodivide"));
	}

	public static String divide(String s) {
	
		// create an empty String
		String empty = "";
		
		// find the number to divide in 
		int parts = 0;
		for (int i = 2; i <= s.length(); i++) {
			if (s.length() % i == 0) {
				parts = i;
				break;
			}
		}
		
		int tempParts = parts;

		
		// add to the string, create a new line every time the index worth the number of the parts!
		for (int i = 0; i < s.length(); i++) {
			empty += s.charAt(i);
			if (i == tempParts - 1) {
				tempParts += parts;
				empty += "\n";
			}

		}

		return empty;
	}

}
