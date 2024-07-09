package streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCount {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,34,12,11,23,44);
		
		long count = list.stream()
		.filter(f->f%2==0)
		.count();
		
		System.out.println(count);
	}

}
