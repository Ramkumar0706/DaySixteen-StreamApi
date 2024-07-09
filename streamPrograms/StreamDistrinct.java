package streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDistrinct {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,34,12,11,23,44);
	Set<Integer> collect = list.stream()
	.distinct()
	.sorted()
	.filter(x->x%2==0)
	.map(y->y+2)
	.collect(Collectors.toSet());
	collect.forEach(System.out::println);
	
	}

}
