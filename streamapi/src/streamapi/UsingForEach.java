package streamapi;

import java.util.HashMap;

public class UsingForEach {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1, "Amit");
		hashMap.put(2, "Kumar");
		hashMap.put(3, "Mandal");
		hashMap.put(4, "Varshii");
		hashMap.put(5, "Hrushi");
		hashMap.put(6, "Patil");
		
		//forEach to iterate and display each key and value pair
		
		hashMap.forEach((Key,value)->System.out.println(Key+" "+value));
	}
}
