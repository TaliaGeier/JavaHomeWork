package base_classes;
import java.util.ArrayList;
import java.util.Arrays;
import exceptions.*;

public class Company extends Nepi {

	// ----------------------ATTRIBUTES----------------------

	ArrayList<Coupon> coupons = new ArrayList<>();

	// ----------------------Get & Set----------------------

	public ArrayList<Coupon> getCoupons() {
		return coupons;
	}


	// ----------------------Constructor----------------------

	public Company(String password, String email, String name, int id, ArrayList<Coupon> coupons)
			throws ExIdValidation, ExNameLength, ExNotNull, ExEmail, ExPassword {
		
		super(password, email, name, id);
		
		
	}



	

	// ----------------------Functions----------------------

	@Override
	public String toString() {
		return super.toString() + "Company coupons=" + getCoupons();
	}
}
