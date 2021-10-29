package com.yedam.java.ch02_02;

public class Tire {

	//필드
	int maxRotation; //최대 회전수
	int accumulatedRotation; //누적 회전수
	String location; //타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 :" + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
 	}
}