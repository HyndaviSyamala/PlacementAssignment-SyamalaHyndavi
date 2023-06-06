import java.util.Scanner;

// A Class that represents use-defined exception

class NegetiveNumberException extends Exception {
	public NegetiveNumberException(String s)
	{
		// Call constructor of parent Exception
		super(s);
	}
}

// A Class that uses above MyException
public class UserDefinedException {
	// Driver Program
	public static void main(String args[])
	{
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter any number");
			
			int number = sc.nextInt();
			
			if(number<0)
				throw new NegetiveNumberException("NegetiveNumberException: You are entering a Negetive Number!");
			else
				System.out.println("your entered number is-:"+number);
			// Throw an object of user defined exception
			
		}
		catch (NegetiveNumberException ne) {
			System.out.println("Caught:");

			// Print the message from MyException object
			System.out.println(ne.getMessage());
		}
	}
}



