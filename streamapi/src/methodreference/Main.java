package methodreference;

public class Main {

	public static void main(String[] args) {
		
		Thread thread = new Thread(MethodReferences::ThreadRunning);
		thread.start();
	}
}
