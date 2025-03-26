package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}
	
	public double area() {
		return length*width;
	}
	
	public boolean square() {
		if (length == width) {
			return true;
		}
		return false;
	}
	
	public boolean areaComparison(Rectangle rectangle2) {
		if (this.area() < rectangle2.area()) {
			return true;
		}
		return false;
	}
	
	public double perimeter() {
		return (length+width)*2;
	}
	
	public static void main (String[]args) {
		Rectangle one = new Rectangle (4, 5);
		Rectangle two = new Rectangle (3, 3);
		Rectangle three = new Rectangle (6, 7);
		System.out.println("the area is " + one.area());
		System.out.println("is this rectangle bigger than the previous one?" + two.areaComparison(three));
	}
}
