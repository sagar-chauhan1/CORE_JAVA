package collections;
import java.util.*;

public class HashMapDemo {
	
	public static void main(String args[]) {
		
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		
		m1.put(1,"jay");
		m1.put(2, "krupal");
		m1.put(3, "dharmik");
		m1.put(null, null);
		m1.put(4, null);
		
		System.out.println(m1);
		System.out.println("---------------------------------");
		System.out.println(m1.get(2));
		System.out.println("---------------------------------");
		System.out.println(m1.entrySet());
		System.out.println("---------------------------------");
		System.out.println(m1.size());
		System.out.println("---------------------------------");
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		System.out.println("---------------------------------");
		System.out.println(m1.remove(2));
		System.out.println(m1);
		System.out.println("---------------------------------");
		System.out.println(m1.containsKey(1));
		System.out.println(m1.containsValue("sag"));
		System.out.println("---------------------------------");
		m1.clear();
		System.out.println(m1);
		System.out.println("---------------------------------");
		
		
		
	}

}
