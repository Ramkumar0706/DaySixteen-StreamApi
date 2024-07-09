package stremToList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamToSet {
	
	public static void main(String[] args) {
		
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(12);
		h.add(10);
		h.add(32);
		
		Set<Integer> collect = h.stream().sorted().map(x->x+2)
		.collect(Collectors.toSet());
		
		collect.forEach(System.out::println);
	}

}
