package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {


	public static void main(String args[]) {
			
			List list=new ArrayList();
			
			list.add(45);
			list.add(70.35);
			list.add(46);
			list.add("seed");
			list.add(88);
			
//			for(Object ob : list) {
//				System.out.println(ob);
//			}
			
			Iterator itr = list.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			

	}

}
