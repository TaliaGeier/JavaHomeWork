import java.util.ArrayList;

import base_classes.*;
import exceptions.*;

public class App {

	@SuppressWarnings("unused")
	public static void main(String[] args){


		ArrayList<Coupon> GameCoupons = new ArrayList<>();

			try {
				Company Dor = new Company("134566", "", "dor", 2, GameCoupons);
			} catch (ExIdValidation | ExNameLength | ExNotNull | ExEmail | ExPassword e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}