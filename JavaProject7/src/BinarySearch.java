import java.util.Arrays;
import java.util.Scanner;

class BinarySearch {
	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of elements in the array");

		// reading the number of elements from the that we want to enter
		int n = sc.nextInt();
		// creates an array in the memory of length n
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			// reading array elements from the user
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Enter Key to be search");
		int key = sc.nextInt();
		int last = arr.length - 1;
		binarySearch(arr, 0, last, key);
	}
}