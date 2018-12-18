package base_classes;

import java.util.ArrayList;

import exceptions.*;

public class Customer extends Nepi {
	
	

	// ----------------------ATTRIBUTES----------------------
	
	private String lastName;
	ArrayList<Coupon> coupons = new ArrayList<>();
	// ----------------------Get & Set----------------------
	
	public ArrayList<Coupon> getCoupons() {
		return coupons;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	
	// ----------------------Constructor----------------------

	public Customer(String lastName, String password, String email, String firstName, int id)
			throws ExIdValidation, ExNameLength, ExNotNull, ExEmail, ExPassword {
		super(password, email, firstName, id);
		setLastName(lastName);
		
		// TODO Auto-generated constructor stub
	}

	
	// ----------------------Functions----------------------


}
