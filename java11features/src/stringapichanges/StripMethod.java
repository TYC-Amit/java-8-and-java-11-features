package stringapichanges;

public class StripMethod {

	public static void main(String[] args) {
		
		String s="   Techno Elevate";
		
		System.out.println(s.strip());
		
		System.out.println("==========================");
		
		System.out.println(s.stripLeading());
		
		System.out.println("==========================");
		
		System.out.println(s.stripTrailing());
	}
}
