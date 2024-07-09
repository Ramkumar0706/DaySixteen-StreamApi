package streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeek {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,34,12,11,23,44);
		
		List<Integer> collect = list.stream()
		.peek(System.out::print)
		.filter(f->f%2==0)
		.peek(System.out::print
				)
		.map(m->m+2)
		.collect(Collectors.toUnmodifiableList());
		
		System.out.println(collect);
	}

}
