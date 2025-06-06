package com.javaex.draw;

public class PointImpl extends DrawApp implements Drawable{
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public PointImpl() {
	}

	public PointImpl(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//메소드 gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "점을 그렸습니다. [X좌표:" + x + ", Y좌표:" + y + "]";
	}
	public void draw() {
		System.out.println("점을 그렸습니다");
		System.out.println("[X좌표:"+ x+", Y좌표:" + y + "]");
	}
}
