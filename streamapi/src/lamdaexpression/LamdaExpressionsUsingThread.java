package lamdaexpression;

public class LamdaExpressionsUsingThread {

	public static void main(String[] args) {
		
		 Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Thread 1 is running");
			}
		};
		
		Thread thread1 = new Thread(r1);
		thread1.start();
		
		Runnable t2=()->{
			System.out.println("Thread 2 is Running");
		};
		
		System.out.println("===================================");
		
		
		
		Thread t3 = new Thread(t2);
	    t3.start();	
	}
}
