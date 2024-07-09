package shortCircuitPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFindAny {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("apple","Mango","orange","bananna","pineapple");
		Stream<String> limit = list.stream().limit(3);
		limit.forEach(System.out::println);
	}

}
