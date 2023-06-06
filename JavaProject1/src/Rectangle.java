
public class Rectangle implements Shape {
	
	private double length;
	private double breadth;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * breadth;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * (length + breadth);
	}

}
