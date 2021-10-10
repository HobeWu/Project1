
package shape;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

	
	public Circle(int upperX, int upperY, int width, int height,Color shapeColor) {
		super(upperX, upperY, width, height, shapeColor);
	}
	
	

	@Override
	public void drawShape(Graphics form) {
		form.fillOval(upperX, upperY, width, width);
	}
	

	@Override
	public double calculateSurface() {
	   double area=width/2 * width/2 * 3.141592;
	   return area;
	}
}
