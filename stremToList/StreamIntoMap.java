package stremToList;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamIntoMap {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "ram");
		hm.put(2, "ram");
		hm.put(3, "ram");
		
		
		
		Map<Integer, String> collect = hm.entrySet().stream().collect(Collectors.toMap(x->x.getKey(), y->y.getValue()));
	System.out.println(collect);	
	collect.forEach(null);
	}

}
