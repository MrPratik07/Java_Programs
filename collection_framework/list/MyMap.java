package collection_framework.list;
import java.util.*;
public class MyMap {

	public static void main(String[] args) {
	Map<String,Integer> m=new HashMap<>();
	m.put("apple", 1);
	m.put("orange",5);
	m.put("banana", 12);
	
	System.out.println(m);
	System.out.println(m.get("banana"));
	
	//contains key
	if(m.containsKey("banana")) {
		System.out.println("there is banana in map");
	}
	else {
		System.out.println("there is no such element in map");
	}
	
	
	//contains value
	if(m.containsValue(5)) {
		System.out.println("there is number");
	}
	else {
		System.out.println("there is no number");
	}
	
	//puts the element if it is absent in map
	m.putIfAbsent("one", 1);
	
	//replace the value of banana
	m.replace("banana", 12, 13);
	
	System.out.println(m.keySet());
	System.out.println(m.values());
	System.out.println(m.entrySet());
	}

}
