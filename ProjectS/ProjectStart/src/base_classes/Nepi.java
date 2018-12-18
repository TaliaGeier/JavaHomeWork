package base_classes;

import exceptions.*;

public abstract class Nepi {

	
	// A class that Combies NEPI, stands for Name,Email,Password,Id!
	
	// ----------------------ATTRIBUTES----------------------
	boolean goodPassword;
	private String password;
	private String email;
	private String name;
	private int id;

	// ----------------------Get & Set----------------------
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	public void setEmail(String email) throws ExEmail, ExNotNull {
		
		// ((email.endsWith(".com")||(email.endsWith(".co.il")||(this.email.endsWith(".gov.il")))
		if (email == null) {
			throw new ExNotNull();
		}
		if (email.contains("@")
				&&  ((email.endsWith(".com") ||(email.endsWith(".co.il")||(email.endsWith(".gov.il")))))) {

			this.email = email;

		} else {
			
			throw new ExEmail(" , you enterd: " + email);
		}
	}

	public void setId(int id) throws ExIdValidation {

		if (id > 0) {

			this.id = id;

		} else {

			throw new ExIdValidation(" , you enterd: " + id);
		}

	}

	public void setName(String name) throws ExNameLength, ExNotNull {

		if (name == null) {
			throw new ExNotNull();
		}

		if (name.length() >= 2) {

			this.name = name;

		} else {

			throw new ExNameLength();
		}
	}
	
	public void setPassword(String password) throws ExPassword {
		

		char[] passwordArr = password.toCharArray();
		
		// making sure the password contains a number.
		
		for (int i = 0; i < passwordArr.length; i++) {
			if (passwordArr[i] > 47 && passwordArr[i] < 58  ) {
				goodPassword = true;
			}
		}
		// checks if the password starts with 2 letters
		if (passwordArr.length >= 6 && passwordArr.length <= 12 ) {
			if (goodPassword) {
				this.password = password;
			}
		}
		
//		if ((passwordArr[0] > 64 && passwordArr[0] < 91) 
//				|| passwordArr[0] > 96	&& passwordArr[0] < 123
//				&& passwordArr[1] > 64 && passwordArr[1] < 91 
//				|| passwordArr[1] > 96	&& passwordArr[1] < 123
//				) {
//		
//			this.password = password;
//	
		else {

			throw new ExPassword(" , you enterd: " + password.length());
		}		
	}



	// ----------------------Constructor----------------------

	public Nepi(String password, String email, String name, int id) throws ExIdValidation, ExNameLength, ExNotNull, ExEmail, ExPassword {
		super();
		setId(id);
		setName(name);
		setEmail(email);
		setPassword(password);
	}

	

	// ----------------------Functions----------------------

	@Override
		public String toString() {
			return "id=" + id + ", email=" + email + "password=" + password + ", name=" + name;
		}
		
}
