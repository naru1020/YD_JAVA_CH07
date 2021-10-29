package com.yedam.java.example1;

public class GOLD extends CustomerAnswer {

	private double saleRatio;
	
	public GOLD() {
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
	
	public GOLD(String customerName, int customerId) {
		super(customerName, customerId);
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showGOLDInfo() {
		return super.showCustomerInfo();
	}
	
}
