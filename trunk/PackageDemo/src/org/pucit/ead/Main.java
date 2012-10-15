package org.pucit.ead;

//import org.pucit.drawable.Circle;
//import org.pucit.drawable.Rectangle;
//import org.pucit.drawable.Triangle;
import org.pucit.drawable.*;
//import static java.lang.Math.PI;
import static java.lang.Math.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		Rectangle  r = new Rectangle();
		Triangle t = new Triangle();
		r.draw();
		t.draw();
		r.onDrag();
		c.onDrag();
		t.onDrag();
		System.out.println("Hello World");
		System.out.println(PI);
	}

}
