package streamPrograms;

import java.util.Arrays;
import java.util.List;

public class RemoveElemetsFormCollection {
	
	
	public static void main(String[] args) {
		List<String> l=Arrays.asList("10","12","13");
		boolean removeIf = l.removeIf(x->x=="10");
		System.out.println(removeIf);
		l.forEach(System.out::println);
	}

}
