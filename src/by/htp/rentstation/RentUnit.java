package by.htp.rentstation;

import java.util.Date;

public class RentUnit {
	
	private Equipment item;
	private int cost;
	private Customer customer;
	private Date rentDate;
	
	public RentUnit(Equipment item, int cost, Customer customer, Date rentDate) {
		super();
		this.item = item;
		this.cost = cost;
		this.customer = customer;
		this.rentDate = rentDate;
	}
	public Equipment getItem() {
		return item;
	}
	public int getCost() {
		return cost;
	}
	public Customer getCustomer() {
		return customer;
	}
	public Date getRentDate() {
		return rentDate;
	}

	
}