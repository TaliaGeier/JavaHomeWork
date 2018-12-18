import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import base_classes.*;
import exceptions.*;

public class App {

	@SuppressWarnings({ "unused", "deprecation" })
	public static void main(String[] args) throws ExIdValidation, ExCantBeZero, ExNotNull {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = new Date("2018-08-29");
		Date date2 = new Date("2018-08-29");

		ArrayList<Coupon> GameCoupons = new ArrayList<>();

		Coupon coupon = new Coupon(1, 1, Category.COFFEE_SHOP, "CAFE", "CAFE", date1, date2 , 1, 10,
				"");

		try {
			Company dor = new Company("aa01", "dor@gmail.com", "Dor", 1, GameCoupons);

		} catch (ExIdValidation e) {

			System.out.println(e.getMessage());

		} catch (ExNameLength e) {
			System.out.println(e.getMessage());

		} catch (ExNotNull e) {
			System.out.println(e.getMessage());

		} catch (ExEmail e) {
			System.out.println(e.getMessage());

		} catch (ExPassword e) {
			System.out.println(e.getMessage());

		}
	}
}