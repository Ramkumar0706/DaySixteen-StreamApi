package streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamSkip {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,34,12,11,23,44);
		
		Optional<Integer> min = list.stream()
		.skip(2)
		.min((x,y)->x.compareTo(y));
		min.ifPresent(System.out::println);
	}

}
