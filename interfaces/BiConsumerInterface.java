package interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInterface {
	
	
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(12,23,11,2,55);
		List<Integer> l2=Arrays.asList(12,23,11,2,55);
		BiConsumer<List<Integer>, List<Integer>> bc=(list1,list2)->{
			list1.forEach(System.out::print);
			System.out.println("\n ==========================");
			list2.forEach(System.out::print);
		};
		
		bc.accept(l, l2);
	}

}
