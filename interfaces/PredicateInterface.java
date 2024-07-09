package interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {
	
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(12,23,11,2,55);
		Predicate<Integer> greatenThan=x->x>15;
		Predicate<Integer> lessThan=x->x<50;
		
		//using short circuit logical gates
		System.out.println(greatenThan.and(lessThan).test(16));
		System.out.println(greatenThan.and(lessThan).test(13));
		System.out.println(greatenThan.or(lessThan).test(16));
		System.out.println(greatenThan.negate().test(13));
		
		
	}

}
