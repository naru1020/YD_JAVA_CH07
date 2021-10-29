package com.yedam.java.example1;

public class VIP extends CustomerAnswer {

	//필드
	private int agentId;
	private double saleRatio;
	
	//생성자
	public VIP() {
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
	}
	
	public VIP(String customerName, int customerId) {
		super(customerName, customerId);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentId = agentId;
	}
	
	//메소드
	public int getAgentId() {
		return agentId;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "상담원 아이디는" + agentId + "입니다.";
	}
}
