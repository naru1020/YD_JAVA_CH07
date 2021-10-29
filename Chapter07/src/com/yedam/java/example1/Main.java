package com.yedam.java.example1;

public class Main {

	public static void main(String[] args) {
	
		/*
		// 일반고객 : 이순신, 10010,, 1000점
		
		CustomerAnswer customerLee = new CustomerAnswer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerId(10010);
		customerLee.setBonusPoint(1000);
		
		//vip : 김유신, 10020, 10000점
		
		VIP customerKim = new VIP();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerId(10020);
		customerKim.setBonusPoint(10000);
		System.out.println(customerKim.showVIPInfo());
		System.out.println();
		*/
		
		CustomerAnswer customerLee = new CustomerAnswer("이순신", 10010);
		customerLee.bonusPoint = 1000;
		
		VIP customerKim = new VIP("김유신", 10020);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		
		System.out.println(customerLee.getCustomerName() + "님이 지불해야 하는 금액은" + customerLee.calcPrice(price) + "원입니다.");
		System.out.println(customerKim.getCustomerName() + "님이 지불해야 하는 금액은" + customerKim.calcPrice(price) + "원입니다.");
		
		CustomerAnswer vipCustomer = new VIP("김자바", 10030);
		System.out.println(vipCustomer.getCustomerName()+ "님이 지불해야 하는 금액은" + vipCustomer.calcPrice(price) + "원입니다.");
		
		System.out.println();
		CustomerAnswer[] customerList = new CustomerAnswer[5];
		
		customerList[0] = new CustomerAnswer("이순신", 10010);
		customerList[1] = new CustomerAnswer("신사임당", 10020);
		customerList[2] = new GOLD("홍길동", 10030);
		customerList[3] = new GOLD("이율곡", 10040);
		customerList[4] = new VIP("김유신", 10050);
		
		System.out.println("=고객정보 출력=");
		
		for(CustomerAnswer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("=할인율과 보너스 포인트 계산=");
		price = 10000;
		for(CustomerAnswer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님이" + cost + "원 지불했습니다.");
			System.out.println("현재 보너스 포인트는" + customer.getBonusPoint() + "점입니다.");
		}
	}
}
