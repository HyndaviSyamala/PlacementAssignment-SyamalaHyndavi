import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {

	ProducerConsumer pc ;
	
	Consumer(ProducerConsumer pc){
		this.pc = pc;
	}

	public void run() {

		while (true) {
			try {
				this.pc.consume();
				
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
