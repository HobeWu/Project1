package shape;

import java.awt.Color;
import java.awt.Graphics;

public class Shape  implements Comparable <Shape>{

	protected int upperX; 
	protected int upperY;
	protected int width;
	protected int height;
	protected Color shapeColor;
	

	
	
	public Shape (int upperX, int upperY, int width, int height, Color shapeColor) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = width;
		this.height = height;
		this.shapeColor = shapeColor;
	}

	
	
	public  void drawShape(Graphics	form) {
		
	}

	
	
	public double calculateSurface() {
		return 0;
	}
	
	@Override
	public int compareTo(Shape shape) {

        if (this.calculateSurface()>shape.calculateSurface()){
            return -1;
        }else if(this.calculateSurface() < shape.calculateSurface()){
            return 1;
        }else {
        	 return 0;
        }
	}



    
    @Override
	public String toString() {
		return "Shape [upperX=" + upperX + ", upperY=" + upperY + ", width="
				+ width + ", height=" + height + ", shapeColor=" + shapeColor
				+ "]";
	}

    
    public Color getColor() {
		return shapeColor;
	}
    
    public int getWidth() {
    	return width;
    }
    
    public int getHeight() {
    	return height;
    }
    
	public int getUpperX() {
		return upperX;
	}
	
	public int getUpperY() {
		return upperY;
	}
	

	
	 public void setColor(Color aShapeColor) {
		 this.shapeColor = aShapeColor;
	 }
	 
	 public void setWidth( int width) {
		 this.width = width;
	 }
	    
	 public void setHeight(int height) {
		 this.height = height;
	 }
	 
	 public void setUpperX(int upperX) {
		 this.upperX = upperX;
	 }
		
	 public void setUpperY(int upperY) {
		 this.upperY = upperY;
	 }
}
