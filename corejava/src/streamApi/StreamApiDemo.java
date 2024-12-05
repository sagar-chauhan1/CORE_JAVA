package streamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {
	
	public static void main(String args[]) {
		List<Integer> noList = Arrays.asList(11,12,13,14,15,16,17,18,19,20);
		
		Stream<Integer> stream = noList.stream();
		
		List<Integer> evenList = stream.filter(i->i%2==0).collect(Collectors.toList());
		
		for(Integer i:evenList) {
			System.out.println(i);
		} 
		
		/*
		//sorting
		
		List<Integer> noList = Arrays.asList(11,12,13,14,15,16,17,18,19,20,1,2,3,4,5);
		
//		Stream<Integer> stream = noList.stream();
		
		List<Integer> sortedList = noList.stream().sorted().collect(Collectors.toList());
		
		for(Integer i:sortedList) {
			System.out.println(i);
		} 
		*/
		
		/*
		//Limit
		
		List<Integer> noList = Arrays.asList(11,12,13,14,15,16,17);
		
		List<Integer> limitList = noList.stream().limit(3).collect(Collectors.toList());
		
		for(Integer i:limitList) {
			System.out.println(i);
		}  
		*/
		
		/*
		// map function
		 
		List<Integer> noList = Arrays.asList(1,2,3,4,5,6,7,8);
		
		List<Integer> mapList = noList.stream().map(i->i*i).collect(Collectors.toList());
		
		for(Integer i:mapList) {
			System.out.println(i);
		}
		
		*/
	}

}
