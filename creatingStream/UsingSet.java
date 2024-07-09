package creatingStream;

import java.util.HashSet;

public class UsingSet {
	
public static void main(String[] args) {
	
	HashSet<Integer> hs=new HashSet<Integer>();
	
	hs.stream().filter(x->x%2==0)
	.forEach(System.out::println);
	
}

}
