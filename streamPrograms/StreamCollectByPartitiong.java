package streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectByPartitiong {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,34,12,11,23,44);
		
		Map<Boolean, List<Integer>> collect = list.stream()
		.collect(Collectors.partitioningBy(s->s>20));
		
		collect.forEach((k,v)->System.out.println(k+" "+v));
	}
}
