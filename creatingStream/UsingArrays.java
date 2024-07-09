package creatingStream;

import java.util.Arrays;

public class UsingArrays {
	public static void main(String[] args) {
		int [] a= {12,3,2,3,4,5,4};
		Arrays.stream(a).forEach(System.out::println);
	}

}
