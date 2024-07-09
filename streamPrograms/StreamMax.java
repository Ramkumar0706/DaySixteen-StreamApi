package streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMax {
	
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,34,12,11,23,44);
		
		Optional<Integer> max = list.stream()
		.max((x,y)->x.compareTo(y));
		max.ifPresent(System.out::println);
		
	}

}
