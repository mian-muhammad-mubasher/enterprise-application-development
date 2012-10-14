package org.pucit.drawable;

public class Circle extends Shape implements Dragable{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle Drawn");
	}

	@Override
	public void onDrag() {
		// TODO Auto-generated method stub
		System.out.println("Circle Dragged");
	}

}
