package stringapichanges;

import java.util.stream.Collectors;

public class LinesMethod {

	public static void main(String[] args) {
		
		String str="Welcome\nTo\nTechno\nElevate";
		
		System.out.println(str);
		
		//Using line method
		System.out.println(str.lines().collect(Collectors.toList()));
	}
}
