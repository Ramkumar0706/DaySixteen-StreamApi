package streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StreamCollect {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,34,12,11,23,44);
		
		TreeMap<Integer, Set<Integer>> collect = list.stream()
				.collect(Collectors.groupingBy(x->x+2,TreeMap::new,Collectors.toSet()));
		System.out.println(collect);
		
		
	}

}
