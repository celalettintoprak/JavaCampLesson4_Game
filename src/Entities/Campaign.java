package Entities;

import java.time.LocalDate;

public class Campaign {
	
	private int id;
	private String name;
	private double discount;
	private LocalDate discountDate;
	private long periodOfValidity; // long baslangic =  System.nanoTime(); - Timer ve TimerTask
	
	
	public Campaign() {
		
	}
	
	public Campaign(int id, String name, double discount, LocalDate discountDate, long periodOfValidity) {
		this.id = id;
		this.name = name;
		this.discount = discount;
		this.discountDate = discountDate;
		this.periodOfValidity = periodOfValidity;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public LocalDate getDiscountDate() {
		return discountDate;
	}

	public void setDiscountDate(LocalDate discountDate) {
		this.discountDate = discountDate;
	}

	public long getPeriodOfValidity() {
		return periodOfValidity;
	}

	public void setPeriodOfValidity(long periodOfValidity) {
		this.periodOfValidity = periodOfValidity;
	}
	
}
