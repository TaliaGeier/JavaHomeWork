package exceptions;

public class ExPassword extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8006848762727303174L;
	static String staticMessage="Password needs to be at least 6 digits or bigger than 0! ";
	
	
	public ExPassword(String message){
		super(staticMessage+message);
	}
}
