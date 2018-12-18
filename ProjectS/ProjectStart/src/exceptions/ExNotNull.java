package exceptions;

public class ExNotNull extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3042585518268241198L;
	static String staticMessage="Can't be Null! ";
	
	
	public ExNotNull(){
		super(staticMessage);
	}
}
