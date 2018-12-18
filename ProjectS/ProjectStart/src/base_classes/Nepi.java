package base_classes;

import exceptions.*;

public abstract class Nepi {

	
	// A class that Combies NEPI, stands for Name,Email,Password,Id!
	
	// ----------------------ATTRIBUTES----------------------
	
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
	
	
	public void setEmail(String email) throws ExEmail {
		
		// ((email.endsWith(".com")||(email.endsWith(".co.il")||(this.email.endsWith(".gov.il")))
		
		int indexLocation = email.indexOf('@');
		if (email.lastIndexOf('.') > indexLocation && email.contains("@") && email.length() > 0) {

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

		if (password.length() < 6 && password.length() > 0) {
			throw new ExPassword(" , you enterd: " + password.length());
		} else {

			this.password = password;
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
			return "password=" + password + ", email=" + email + ", name=" + name + ", id=" + id;
		}
		
}
