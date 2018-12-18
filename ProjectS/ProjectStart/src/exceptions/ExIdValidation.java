package exceptions;

public class ExIdValidation extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2419880223292034559L;
	static String staticMessage="Id needs to be bigger than 0, and cant contain letters. ";
	
	
	public ExIdValidation(String message){
		super(staticMessage+message);
	}
}
