
public class Triangles implements Shape {
	
	private double side1;
	private double side2;
	private double side3;
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		
		double s=(side1+side2+side3)/2;
		
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
         
		
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (side1+side2+side3);
	}

}
