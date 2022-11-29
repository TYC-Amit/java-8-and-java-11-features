package streamapi;

public class StringJoiner {

	public static void main(String[] args) {
		
		java.util.StringJoiner joiner = new java.util.StringJoiner(",");
		
		joiner.add("Amit");
		joiner.add("kumar");
		joiner.add("Mandal");
		
		System.out.println(joiner);
	}
}
