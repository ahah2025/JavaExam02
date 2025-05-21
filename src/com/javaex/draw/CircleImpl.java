package com.javaex.draw;

public class CircleImpl extends DrawApp implements Drawable{

	//필드
	private int radius;

	//생성자
	public CircleImpl() {
	}

	public CircleImpl(int radius) {
		this.radius = radius;
	}
	
	//메소드 gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "원을 그렸습니다. [반지름:" + radius + "]";
	}
	
	public void draw() {
		System.out.println("원을 그렸습니다");
		System.out.println("[반지름:"+ radius);
	}
}
