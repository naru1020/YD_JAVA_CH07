package com.yedam.java.ch02_02;

public class KumhoTire extends Tire {

	// 필드

	// 생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Kumho Tire 수명 :" + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("***" + location + "Kumho Tire 펑크 ***");
			return false;
		}
	}
}
