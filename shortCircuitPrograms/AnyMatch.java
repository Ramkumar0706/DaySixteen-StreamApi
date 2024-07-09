package shortCircuitPrograms;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("apple","Mango","orange","bananna","pineapple");
		boolean anyMatch = list.stream()
		.anyMatch(s->s.endsWith("e"));
		System.out.println(anyMatch);
	}

}
