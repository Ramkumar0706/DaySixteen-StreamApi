package streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,34,12,11,23,44);
		
		int  reduce = list.stream()
		.reduce(0,(e,c)->e+c);
		
		System.out.println(reduce);
		
		Optional<Integer>  reduce1 = list.stream()
				.reduce((e,c)->e-c);
		reduce1.ifPresent(System.out::println);
	
	}

}
