package Entities;

import java.time.LocalDate;

public class Purchase {
	
	private int id;
	private double purchaseAmount;
	private LocalDate dateOfPurchase;
	
	
	public Purchase() {
		
	}
	
	public Purchase(int id, double purchaseAmount, LocalDate dateOfPurchase, Campaign campaign, Player player, Game game) {
		this.id = id;
		this.purchaseAmount = purchaseAmount;
		this.dateOfPurchase = dateOfPurchase;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(double purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	
}
