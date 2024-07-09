package streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamFilter {

	public static void main(String[] args) {

		List<String> l=Arrays.asList("ram","tom","ramkumar");			
		l.stream()
		.sorted((x,y)->y.compareTo(x))
		.filter(t->t.startsWith("r"))
		.forEach(System.out::println);

	}

}
