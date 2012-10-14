package org.pucit.drawable;

public class Rectangle extends Shape implements Dragable{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Drawn");
	}

	@Override
	public void onDrag() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Dragged");
	}

}
