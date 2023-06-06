import java.util.Scanner;

public class JavaProject1Test {

	public static void main(String[] args) {
		// Rectangle area and parameter
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose the shape option to find the area and parameter ");
		
		boolean flag = true;
		
		
		while(flag) {
			System.out.println();
			System.out.println("Choose the shape option to find the area and parameter ");
			System.out.println("Enter: 1 to choose for Reactangle: ");
			System.out.println("Enter: 2 to choose for Circle: ");
			System.out.println("Enter: 3 to choose for Trianlge: ");
			System.out.println("Enter: 5 to Exit: ");
			
			int option = sc.nextInt();
			
			
			switch (option) {
			case 1:
				
				System.out.print("Enter Length of the rectangle - ");
				double length = sc.nextDouble();

				System.out.print("Enter breadth of the rectangle - ");
				double breadth = sc.nextDouble();

				Rectangle r = new Rectangle(length, breadth);

				System.out.println("Rectangle - Area: " + r.area());
				System.out.println("Rectangle - perimeter: " + r.perimeter());
				
				break;
			case 2:
				
				System.out.print("Enter Radius of the Circle - ");
				double radius = sc.nextDouble();

				Circle circle = new Circle(radius);
				System.out.println("Circle - Area: " + circle.area());
				System.out.println("Circle - perimeter: " + circle.perimeter());
				
				break;
			case 3:
				
				Triangles t = new Triangles();

				System.out.println("Enter the 1st side:");
				double a = sc.nextDouble();

				System.out.println("Enter the 2nd side:");
				double b = sc.nextDouble();

				System.out.println("Enter the 3rd side:");
				double c = sc.nextDouble();

				System.out.println("Rectangle - Area: " + t.area());
				System.out.println("Rectangle - perimeter: " + t.perimeter());
				
				break;
			case 5:
				flag = false;
				System.exit(0);
			default :
				System.out.println("you have entered a wrong option please choose correct one");
				break;
			}
			
		}
		
		
		

		

		// Circle area and parameter



	

	}

}
