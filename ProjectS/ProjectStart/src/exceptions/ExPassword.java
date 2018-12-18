package exceptions;

public class ExPassword extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8006848762727303174L;
	
	static String staticMessage="Password needs to be at least 6 characters, smaller than 12, must"
			+  "start with 2 letters! (lowercase or uppercase) and must contain at least 1 digit. ";
	
	
	public ExPassword(String message){
		super(staticMessage+message);
	}
}
