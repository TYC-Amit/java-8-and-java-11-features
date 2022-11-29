package streamapi.fetchingdatainlist;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectingData {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Amit", 25));
		list.add(new Student(2, "Hrushi", 24));
		list.add(new Student(3, "Kumar", 22));
		list.add(new Student(2, "Varshii", 25));

		// fetching data as set
		Set<Student> collect = list.stream().filter(t -> t.rollNo > 2).collect(Collectors.toSet());

		// iterating data
		for (Student student : collect) {
			System.out.println(student.rollNo + "  " + student.name + "  " + student.age);
		}
	}
}
