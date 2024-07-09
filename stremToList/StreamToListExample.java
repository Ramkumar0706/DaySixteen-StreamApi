package stremToList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToListExample {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(12,34,12,11,23,44);
		List<Integer> collect = list.stream()
				.map(m->m*2)
				.collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

}
