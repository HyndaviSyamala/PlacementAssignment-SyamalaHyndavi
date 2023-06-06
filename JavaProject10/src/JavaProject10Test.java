import java.util.ArrayList;
import java.util.Scanner;

public class JavaProject10Test {

//Java program to find second largest
//element in an array

//Function to print the second largest elements
	static void printSecondLargest(ArrayList list, int listSize) {
		int i, first, second;

		// There should be atleast two elements
		if (listSize < 2) {
			System.out.printf(" Invalid Input ");
			return;
		}

		int largest = second = Integer.MIN_VALUE;

		// Find the largest element
		for (i = 0; i < listSize; i++) {
			largest = Math.max(largest, (int) list.get(i));
		}

		// Find the second largest element
		for (i = 0; i < listSize; i++) {
			if ((int) list.get(i) != largest)
				second = Math.max(second, (int) list.get(i));
		}
		if (second == Integer.MIN_VALUE)
			System.out.printf("There is no second " + "largest element\n");
		else
			System.out.printf("The second largest " + "element is %d\n", second);
	}

	private static void printSecondSmallest(ArrayList list, int listSize) {
		// TODO Auto-generated method stub

		int i, first, second;

		// There should be atleast two elements
		if (listSize < 2) {
			System.out.printf(" Invalid Input ");
			return;
		}

		int samllest = second = Integer.MAX_VALUE;

		// Find the largest element
		for (i = 0; i < listSize; i++) {
			samllest = Math.min(samllest, (int) list.get(i));
		}

		// Find the second largest element
		for (i = 0; i < listSize; i++) {
			if ((int) list.get(i) != samllest)
				second = Math.min(second, (int) list.get(i));
		}
		if (second == Integer.MIN_VALUE)
			System.out.printf("There is no second " + "Smallest element\n");
		else
			System.out.printf("The second Smallest " + "element is %d\n", second);

	}

//Driver code
	public static void main(String[] args) {
		
		System.out.println("Enter the number of element int the list");
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element");
			int ele = sc.nextInt();
			list.add(ele);
		}
		
	

		printSecondLargest(list, n);
		printSecondSmallest(list, n);
	}

}

//This code is contributed by Amit Katiyar
