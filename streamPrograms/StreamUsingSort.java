package streamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamUsingSort {

	
	public static void main(String[] args) {

		List<Integer> l=Arrays.asList(4,3,2,1,6);
		Stream<Integer> sorted = l.stream().sorted((x,y)->y.compareTo(x));
		sorted.forEach(System.out::println);
		System.out.println("=============");
		l.stream().sorted().forEach(System.out::println);
		sorted.forEach(System.out::println);
	}
}
