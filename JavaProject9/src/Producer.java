

public class Producer extends Thread {
	
	ProducerConsumer pc ;
	
	Producer(ProducerConsumer pc){
		this.pc = pc;
	}
	
	public void run() {
		
		while(true) {
			try {
				this.pc.produce();
				
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
