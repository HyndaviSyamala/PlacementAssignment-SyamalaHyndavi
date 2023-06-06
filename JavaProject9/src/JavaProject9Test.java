public class JavaProject9Test {
	public static void main(String[] args) throws InterruptedException {
		// Object of a class that has both produce()
		// and consume() methods
		final ProducerConsumer pc = new ProducerConsumer();

		Producer p = new Producer(pc);
		Consumer c = new Consumer(pc);
	

	

		// Start both threads
		p.start();
		c.start();


	}
}
