package streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectByJoining {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,34,12,11,23,44);
		
		String join=list.stream()
		.map(String::valueOf)
		.collect(Collectors.joining(", "));
		System.out.println(join);
	}

}
