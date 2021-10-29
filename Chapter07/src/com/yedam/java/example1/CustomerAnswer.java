package com.yedam.java.example1;

public class CustomerAnswer {
	//필드
	private int customerId;
	private String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	public CustomerAnswer() {
		this.customerGrade = "실버";
		this.bonusRatio = 0.01;
		
		System.out.println("Customer() 생성자 호출");
	}
	
	public CustomerAnswer(String customerName, int customerId) {
		this();
		this.customerName = customerName;
		this.customerId = customerId;
	}

	public int getcustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBounsRatio(double bounsRatio) {
		this.bonusRatio = bounsRatio;
	}

	// 메소드
	public int calcPrice(int price) {
	
		bonusPoint += price * bonusRatio;
		return price;
		
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}
	
	
}
