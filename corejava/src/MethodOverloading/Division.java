package MethodOverloading;

public class Division {
	
	void div(int a, int b) {
		int div=a/b;
		System.out.println(div);
	}
	void div(int a, double b) {
		double div=a/b;
		System.out.println(div);
	}
	void div(int a, int b,int c) {
		int div=a/b/c;
		System.out.println(div);
	}
	
	Division(){
		System.out.println("Division");
	}

}
