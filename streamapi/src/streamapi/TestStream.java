package streamapi;

import java.util.ArrayList;

public class TestStream {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Amit");
		list.add("Mandal");
		list.add("Lima");
		list.add("kumar");
		list.add("javasdd");
		list.add("sqlsdjs");
		
		int count=0;
		
		for (String str : list) {
			if (str.length()<5) {
				count++;
				System.out.println(count+" List of name count less than 5");
			}
		}
		
		long count1=list.stream().filter(str -> str.length()<5).count();
		System.out.println(count1+" Using Stream And Lambda Expressions name count less than 5");
	}
}
