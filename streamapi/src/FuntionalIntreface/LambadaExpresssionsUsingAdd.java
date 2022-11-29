package FuntionalIntreface;

public class LambadaExpresssionsUsingAdd {

	public static void main(String[] args) {
		
		AddInterface addInterface=(a,b)->{
		System.out.println(a+b);	
		};
		addInterface.add(22,33);
	}
}
