package lamdaexpression.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class MainUsingComparator {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Amit"));
		list.add(new Student(2, "Jiya"));
		list.add(new Student(3, "Rancho"));
		list.add(new Student(4, "Aman"));
		
		System.out.println("Soting on the basis on name");
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		for (Student student : list) {
			System.out.println(student.id+" "+student.name);
		}
		System.out.println("======================================================");
		
		//using filter
		
		Stream<Student> filter = list.stream().filter(t -> t.id>1);
		
		filter.forEach(student -> System.out.println(student.name));
	}
}
