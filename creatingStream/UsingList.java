package creatingStream;

import java.util.ArrayList;

public class UsingList {
 
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.stream().map(t->t*2)
		.forEach(System.out::println);
	}
}
