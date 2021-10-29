package com.yedam.java.ch02_02;

public class HankookTire extends Tire{
	

	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Hankook Tire 수명 :" + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("***" + location + "Hankook Tire 펑크 ***");
			return false;
		}
	}

}
