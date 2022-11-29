package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamUsingStream {

	public static void main(String[] args) {

//		create stream using stream
		Stream<String> names = Stream.of("Amit", "jai");
		names.forEach(System.out::println);

		System.out.println("=======================================================");

//		create stream using array of elements
		Stream<Integer> intStream = Stream.of(new Integer[] { 1, 2, 3, 4, 5 });
		intStream.forEach(System.out::println);

		System.out.println("=====================================================================");

		// create stream using list
		List<String> name = Arrays.asList("vishal", "amit");
		Stream<String> nameStream = name.stream();
		nameStream.forEach(System.out::println);

		System.out.println("=========================================================");

//		stream map
		List<String> asList = Arrays.asList("jai", "mahesh", "vishal");
		asList.stream().map(String::toUpperCase).forEach(System.out::println);

		System.out.println("================================================================");

		// stream using distinct method
		Stream.of("jai", "mahesh", "amit", "jai", "amit", "vishal").distinct().forEach(System.out::println);
	}
}
