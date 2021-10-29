package com.yedam.java.ch01_01;

public class Main {

	public static void main(String[] args) {
		
		DmbPhone dmb = new DmbPhone("자바폰", "검정", 10);
		
		System.out.println("모델 : " + dmb.model);
		System.out.println("컬러 : " + dmb.color);
		
		System.out.println("채널 : " + dmb.channel);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("안녕하세요");
		dmb.sendVoice("반갑습니다.");
		dmb.hangUp();
		
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();
		
		Student student = new Student("홍길동", "123445-1233542", 1);
		System.out.println("name :" + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
		
		int r = 10;
		Calculator cal = new Calculator();
		System.out.println("원면적 : " + cal.areaCircle(r));
		
		Computer com = new Computer();
		System.out.println("원면적 : " + com.areaCircle(r));
		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		System.out.println();
	}
}
