package MethodOverloading;

public class Addition {
	
	void add(int a, int b) {
		int add=a+b;
		System.out.println(add);
	}
	void add(int a, double b) {
		double add=a+b;
		System.out.println(add);
	}
	void add(int a, int b,int c) {
		int add=a+b+c;
		System.out.println(add);
	}
	

	Addition(){
		System.out.println("Addition");
	}
}
