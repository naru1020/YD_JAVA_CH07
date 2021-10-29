package com.yedam.java.example2;

public class Player {

	//필드
	protected Playerlevel level;
	
	
	public void setLevel(Playerlevel level) {
		this.level = level;
	}

	//생성자
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public Playerlevel getLevel() {
		return level;
	}
	
	
	//메소드
	public void upgrade(Playerlevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);
	}
}
