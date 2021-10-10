package shape;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {

	
	
	
	public Square(int upperX, int upperY, int width, int height,Color shapeColor) {
		super(upperX, upperY, width, height, shapeColor);
	}

	
	
	@Override
	public void drawShape(Graphics form) {
		form.fillRect(upperX, upperY, width, width);
	}
	

	
	
	@Override
	public double calculateSurface() {
	   double area= width * width;
	   return area;
	}
	
	
	
	
	
}
