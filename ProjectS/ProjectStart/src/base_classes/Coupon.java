package base_classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import exceptions.*;

public class Coupon {

	// ----------------------ATTRIBUTES----------------------

	private int id;
	private int companyId;
	private Category category;
	private String title;
	private String description;
	private Date start_date;
	private Date end_date;
	private int amount;
	private double price;
	private String img;

	// ----------------------Get & Set----------------------

	public int getId() {
		return id;
	}

	public int getCompanyId() {
		return companyId;
	}

	public Category getCategory() {
		return category;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Date getStart_date() {
		return start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public int getAmount() {
		return amount;
	}

	public double getPrice() {
		return price;
	}

	public String getImg() {
		return img;
	}

	public void setId(int id) throws ExIdValidation {

		if (id > 0) {

			this.id = id;

		} else {

			throw new ExIdValidation(" , you enterd: " + id);
		}

	}

	public void setCompanyId(int companyId) throws ExIdValidation {

		if (companyId > 0) {

			this.companyId = companyId;

		} else {

			throw new ExIdValidation(" , you enterd: " + companyId);
		}

	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setTitle(String title) throws ExNotNull {

		if (title == null) {
			throw new ExNotNull();
		} else {
			this.title = title;
		}
	}

	public void setDescription(String description) throws ExNotNull {
		if (description == null) {
			throw new ExNotNull();
		} else {
			this.description = description;
		}
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public void setAmount(int amount) throws ExCantBeZero {
		if (amount > 0) {
			this.amount = amount;
		} else {
			throw new ExCantBeZero(" , you enterd: " + amount);

		}
	}

	public void setPrice(double price) throws ExCantBeZero {
		if (price > 0) {
			this.price = price;
		} else {
			throw new ExCantBeZero(" , you enterd: " + price);
		}
	}

	public void setImg(String img) {
		this.img = img;
	}

	// ----------------------Constructor----------------------

	public Coupon(int id, int companyId, Category category, String title, String description, Date start_date, Date end_date,
			int amount, double price, String img) throws ExIdValidation, ExCantBeZero, ExNotNull {
		super();
		setId(id);
		setCompanyId(companyId);
		setCategory(category);
		setTitle(title);
		setDescription(description);
		setStart_date(start_date);
		setEnd_date(end_date);
		setAmount(amount);
		setPrice(price);
		setImg(img);
	}

	// ----------------------Functions----------------------

	@Override
	public String toString() {
		return "Coupon id=" + id + ", companyId=" + companyId + ", category=" + category + ", title=" + title
				+ ", description=" + description + ", start_date=" + start_date + ", end_date=" + end_date + ", amount=" + amount
				+ ", price=" + price + ", img=" + img;
	}

}
