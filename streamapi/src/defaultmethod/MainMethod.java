package defaultmethod;


public class MainMethod {   

	public static void main(String[] args) {
		
		StaticMethodTest test = new StaticMethodTest();
		
		//calling default method
		test.display();
		
		//calling abstract method
		test.displayMore("Calling Abstract Method");
		
		//calling static method
		DeafultMethod.show("Calling Staic Method");
		
	}
}