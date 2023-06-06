import java.util.LinkedList;
import java.util.Random;

public class ProducerConsumer {

	// This class has a list, producer (adds items to list
	// and consumer (removes items).

	// Create a list shared by producer and consumer
	// Size of list is 2.
	LinkedList<Integer> list = new LinkedList<>();
	// int capacity = 1;
	boolean flag = false;
	int sum = 0;

	// Function called by producer thread
	synchronized public void produce() throws InterruptedException {
		
		if (flag) {
			// producer thread waits when we add one  element
			wait();
		}

		

		Random rand = new Random();
		// Generate random integers in range 0 to 999
		int rand_int1 = rand.nextInt(10);

		System.out.println("Producer produced-" + rand_int1);

		
		list.add(rand_int1);

		flag = true;

		// notifies the consumer thread that
		// now it can start consuming
		notify();

		

	}

	// Function called by consumer thread
	synchronized public void consume() throws InterruptedException {

		if (!flag) {
			// consumer thread waits when we consume one element
			wait();
		}
		
	

		// to retrieve the first job in the list
		int val = list.removeFirst();
		
		sum+= val;
		
		System.out.println("Consumer sum consumed-" + sum);

		// Wake up producer thread
		flag = false;
		notify();

	
		

	}
}
