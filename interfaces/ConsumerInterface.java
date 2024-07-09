package interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
	
	public static void main(String[] args) {
		 List<Integer> l=Arrays.asList(12,23,11,2,55);
		 Consumer<List<Integer>>multiply=list-> list.stream().map(m->m*2).forEach(System.out::println);;
		 
		 Consumer<List<Integer>> display=System.out::println;
		 multiply.andThen(display).accept(l);
		 
	}

}
