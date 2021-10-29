package com.yedam.java.example1;

public class Vipcustomer {

	//필드
	private int customerId;
	private String customerName;
	private String customerGrade;
	private int bonusPoint;
	private double bonusRatio;
	
	private int agentId;
	private double saleRatio;
	
	//vip 고객 담당 상담원 아이디
	//할인율

	//생성자
	//고객등급, 보너스 적립, 할인율
	public Vipcustomer() {
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentId = agentId;
	}
	
	//메소드
	//calPrice
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	//showCustomerInfo()
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}

	
}
