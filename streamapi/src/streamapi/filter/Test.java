package streamapi.filter;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"amit"));
		list.add(new Student(3,"mandal"));
		list.add(new Student(2,"amit"));
		
		Stream<Student> filterData = list.stream().filter(t -> t.rollNo>2);
		filterData.forEach(
				Student -> System.out.println(Student.name)
				);
		}
}
