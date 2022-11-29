package streamapi.fetchingdatainlist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FetchingDataInListUsingCollectorsTest {

	public static void main(String[] args) {
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		arrayList.add(new Student(1, "Amit", 25));
		arrayList.add(new Student(1, "Mandal", 24));
		arrayList.add(new Student(1, "Kumar", 22));
		
		List<String> collect = arrayList.stream().map(t -> t.name).collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
