package shape;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

	
	public Rectangle(int upperX, int upperY, int width, int height,Color shapeColor) {
		super(upperX, upperY, width, height, shapeColor);
	}
	
	
	@Override
	public void drawShape(Graphics form) {
		form.fillRect(upperX, upperY, width, height);
	}
	
	

	
	@Override
	public double calculateSurface() {
	   double area= width * height;
	   return area;
	}
}
