package lamdaexpression;

import java.util.ArrayList;

public class LamdaExpressionUsingList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Amit");
		list.add("Kumar");
		list.add("Mandal");
		list.add("Hrushi");
		list.add("Anil");
		list.add("Aman");
		
		list.forEach((name)->System.out.println(name));
	}
}
