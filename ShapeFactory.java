package shape;

import java.awt.Color;

public class ShapeFactory {


	
	
	public Shape getShape(String shapeType, int upperX, int upperY, int width,
			int height, Color shapeColor) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle(upperX, upperY, width, height, shapeColor);
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle(upperX, upperY, width, height, shapeColor);
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square(upperX, upperY, width, height, shapeColor);
		}
		return null;
	}
	
}
