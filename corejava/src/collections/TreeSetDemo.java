package collections;

import java.util.*;

public class TreeSetDemo {
	
	public static void main(String args[]) {
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(34);
		set.add(22);
		set.add(10);
		set.add(67);
		set.add(28);
		
		System.out.println(set);
	}

}
