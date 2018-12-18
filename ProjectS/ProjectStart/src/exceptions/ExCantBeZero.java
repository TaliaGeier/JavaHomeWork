package exceptions;

public class ExCantBeZero extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4231994013019620270L;
	static String staticMessage="This field needs to be bigger than 0.";
	
	
	public ExCantBeZero(String message){
		super(staticMessage+message);
	}
}
