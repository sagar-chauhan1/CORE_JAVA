package collections.maps;
import java.util.*;
import java.util.Map.Entry;

public class HashmapDemo {
	
	public static void main(String args[]) {
		Map<String,Long> m1 = new HashMap<String,Long>();
		
		m1.put("sagar",5265372586l);
		m1.put("jay",9537258945l);
		m1.put("krupal",7635372584l);
		m1.put("dharmik",6167258948l);
		m1.put("hardik",5238372584l);
		m1.put("vishal",9887258949l);
		
		System.out.println(m1.keySet());
		System.out.println("=================================");
		
		System.out.println(m1.entrySet());
		System.out.println("=================================");
		
		System.out.println(m1.containsKey("sagar"));
		System.out.println("=================================");
		
		System.out.println("Contact No. of Jay"+m1.get("jay"));
		System.out.println("=================================");
		
		for(Entry<String, Long> entry: m1.entrySet()) {
			System.out.println(entry);
		}
	}
}
