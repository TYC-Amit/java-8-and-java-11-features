package defaultmethod;

public interface DeafultMethod {

	default void display() {

		System.out.println("Default Method");
	}

	//abstract method
	void displayMore(String msg);
	
	//static method
	static void show(String msg){    
        System.out.println(msg);    
    }  
}
