
public class TestJavaProject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is Deafult constructor calling parent from child");

		ChildClass chld = new ChildClass();

		System.out.println("This is Parmetrized constructor calling parent from child");

		ChildClass child2 = new ChildClass("Hello Proggrammer");

		System.out.println("Key Points about constructor:/n");
		System.out.println("There are two rules defined for the constructor.\r\n" + "\r\n"
				+ "1. Constructor name must be the same as its class name\r\n"
				+ "2. A Constructor must have no explicit return type\r\n"
				+ "3. A Java constructor cannot be abstract, static, final, and synchronized");

	}

}
