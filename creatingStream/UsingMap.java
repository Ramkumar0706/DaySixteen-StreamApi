package creatingStream;

import java.util.HashMap;
import java.util.Map;

public class UsingMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(1, "ram");
		
		m.entrySet().stream().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
		
	}

}
