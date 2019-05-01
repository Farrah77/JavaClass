package com.class29;

public class Test {

	public static void main(String[] args) {
		
		Shape obj = new Circle(5.0);
		obj.calculateArea();
		obj.calculatePerimeter();
		
        Shape obj1 = new Square(7.2);
        obj1.calculateArea();
        obj1.calculatePerimeter();
	}

}
