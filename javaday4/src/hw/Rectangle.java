package hw;

public class Rectangle {
	int height;
	int width;
	
	public Rectangle (int height , int width) {
		this.height = height;
		this.width = width;
	}
	
	public void getArea() {
		System.out.println("The area of the rectangle is " + (height * width));
	}
}
