package com.javaex.draw;

import java.util.ArrayList;

public class DrawApp {
	
	public static void main(String[] args) {
		
		//삼각형
		ArrayList<TriangleImpl> tList = new ArrayList<TriangleImpl>();
		
		TriangleImpl t01 = new TriangleImpl(3,3);
		
		tList.add(t01);
		
		TriangleImpl ti = tList.get(0);
		System.out.println("--------------------------------------");
		System.out.println(ti.toString());
		System.out.println("--------------------------------------");
		
		// 원 //////////////////////////////////////////
		
		ArrayList<CircleImpl> cList = new ArrayList<CircleImpl>();
	
		CircleImpl c01 = new CircleImpl(10);
		
		cList.add(c01);
		
		CircleImpl ci = cList.get(0);
		System.out.println("--------------------------------------");
		System.out.println(ci.toString());
		System.out.println("--------------------------------------");
		
		//  점 그리기///////////////////////////////////////////////
		
		ArrayList<PointImpl> pList = new ArrayList<PointImpl>();

		PointImpl pi01 = new PointImpl(3,7);
		
		pList.add(pi01);
		
		PointImpl pi = pList.get(0);
		System.out.println("--------------------------------------");
		System.out.println(pi.toString());
		System.out.println("--------------------------------------");
		
		
	}
}
