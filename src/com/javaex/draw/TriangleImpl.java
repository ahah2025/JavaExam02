package com.javaex.draw;

public class TriangleImpl extends DrawApp implements Drawable{

	//필드
	private int width;
	private int height;
	
	//생성자
	public TriangleImpl() {
	}

	public TriangleImpl(int width, int height) {
		this.width = width;
		this.height = height;
	}

	//메소드 gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "삼각형을 그렸습니다. [가로:" + width + ", 세로:" + height + "]";
	}
	public void draw() {
		System.out.println("삼각형을 그렸습니다.");
		System.out.println("[가로:" + width + ", 세로:" + height + "]");
	}
}
