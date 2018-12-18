package exceptions;

public class ExEmail extends Exception {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3115852377840055096L;
	
	
	static String staticMessage="Email Cant be Empty and must contain a '@' symbol! ";
	
	
	public ExEmail(String message){
		super(staticMessage+message);
	}
}
