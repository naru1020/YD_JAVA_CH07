package com.yedam.java.example2;

public class Main {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		System.out.println();

		Advanced advanced = new Advanced();
		player.upgrade(advanced);
		player.play(2);
		System.out.println();

		Super sLevel = new Super();
		player.upgrade(sLevel);
		player.play(3);
	}
}
