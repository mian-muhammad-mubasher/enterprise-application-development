package org.pucit.drawable;

abstract class Shape{
	public void draw(){
		System.out.println(this.getClass()+" drawn");
	}
}
