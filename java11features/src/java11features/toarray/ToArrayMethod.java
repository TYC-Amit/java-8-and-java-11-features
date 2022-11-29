package java11features.toarray;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("amit");
		list.add("mandal");
		
		System.out.println(list);
		
		String[] array = list.stream().toArray(size-> new String[size]);
		System.out.println(Arrays.toString(array));
		
		String[] array2 = list.toArray(String[]::new);
		System.out.println(Arrays.toString(array2));
	}
}
