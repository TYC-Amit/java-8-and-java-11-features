package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollectorsUsingGroupingBy {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Amit","Jai","Veeru","Amit","jai","jai");
		
		Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);
	}
}
