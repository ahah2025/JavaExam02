package com.javaex.draw;

public class TriangleImpl {

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
		return "TriangleImpl [width=" + width + ", height=" + height + "]";
	}
}
