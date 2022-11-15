package circle;

import shape.*;

public class Circle implements Shape{
	private int radius;
	
	public Circle(int radius){
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("반지름 "+radius);
		
	}

	@Override
	public double getArea() {
		return radius*radius*PI;
	}
}
