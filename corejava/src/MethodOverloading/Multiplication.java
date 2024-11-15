package MethodOverloading;

public class Multiplication {
	
	void mul(int a, int b) {
		int mul=a*b;
		System.out.println(mul);
	}
	void mul(int a, double b) {
		double mul=a*b;
		System.out.println(mul);
	}
	void mul(int a, int b,int c) {
		int mul=a*b*c;
		System.out.println(mul);
	}
	
	Multiplication(){
		System.out.println("Multiplication");
	}
}
