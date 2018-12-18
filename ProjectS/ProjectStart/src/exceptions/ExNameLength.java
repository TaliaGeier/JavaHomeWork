package exceptions;

public class ExNameLength extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4960449405446149183L;
	
	static String staticMessage="Name too short! (must contain at least 2 letters) ";
	
	
	public ExNameLength(){
		super(staticMessage);
	}
}
