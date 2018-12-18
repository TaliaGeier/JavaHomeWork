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

	public void setlastName(String lastName) throws ExNameLength, ExNotNull {

		if (lastName == null) {
			throw new ExNotNull();
		}

		if (lastName.length() >= 2) {

			this.lastName = lastName;

		} else {

			throw new ExNameLength();
		}
	}

	// ----------------------Constructor----------------------

	public Customer(int id, String lastName, String firstName, String email, String password, ArrayList<Coupon> coupons)
			throws ExIdValidation, ExNameLength, ExNotNull, ExEmail, ExPassword {
		super(password, email, firstName, id);
		setlastName(lastName);
		this.coupons = coupons;
	}

	// ----------------------Functions----------------------

	@Override
	public String toString() {
		return super.toString() + ", last name " + getLastName() + ", customer's coupons " + getCoupons();
	}
}
