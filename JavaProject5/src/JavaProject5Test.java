
//ABASTRACT CLASS-

/*An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
*/

//INTERFACE


public class JavaProject5Test {
	public static void main(String args[]) {
		
		System.out.println("***********About Abstract Class***********:\n");
		
		System.out.println("An abstract class must be declared with an abstract keyword.\r\n"
				+ "It can have abstract and non-abstract methods.\r\n"
				+ "It cannot be instantiated.\r\n"
				+ "It can have constructors and static methods also.\r\n"
				+ "It can have final methods which will force the subclass not to change the body of the method.");
		
		System.out.println("\n***********About Interface ***********:\n");
		
		System.out.println("you can say that interfaces can have abstract methods and variables. It cannot have a method body.\r\n"
				+ "\r\n"
				+ "Java Interface also represents the IS-A relationship.\r\n"
				+ "\r\n"
				+ "It cannot be instantiated just like the abstract class.\r\n"
				+ "\r\n"
				+ "Since Java 8, we can have default and static methods in an interface.\r\n"
				+ "\r\n"
				+ "Since Java 9, we can have private methods in an interface.");
	
		System.out.println("\n*********** Program output ***********:\n");	
		ParentInterface obj = new ChildClass();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}
}
