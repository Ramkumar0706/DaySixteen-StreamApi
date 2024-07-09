package interfaces;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionInterface {
	
	public static void main(String[] args) {
		Function<Integer, String> fun=x->x+" added";
		String apply = fun.apply(12);
		System.out.println(apply);
		fun=fun.andThen(t->t.toUpperCase());
		String apply2 = fun.apply(12);
		System.out.println(apply2);
		
		
	}

}
