package com.yedam.java.ch02_04;

public class Example {

	public static void method1(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method1 - Child로 변환 성공");
	}
	
	public static void method2(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method2 - child로 변환 성공");
		} else {
			System.out.println("method2 - child로 변환 실패");
		}
	}
	
	
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		// 자식 -> 부모 변환할 때 자동 타입변환 일어남
		
		//parent.field2 = "data2";
		//parent.method3();
		
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
		// 부모 -> 자식으로 변환할 때는 강제 타입 변환. 캐스팅 괄호 사용.
		
		System.out.println();
		method1(parent);
		parent = new Children();
		method2(parent);
		//메소드 안까지는 들어가는데 강제 타입 변환이 못 일어나서 오류.
	}
}
