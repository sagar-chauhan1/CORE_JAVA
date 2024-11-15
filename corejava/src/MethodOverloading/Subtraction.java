package MethodOverloading;

public class Subtraction {
	
	void sub(int a, int b) {
		int sub=a-b;
		System.out.println(sub);
	}
	void sub(int a, double b) {
		double sub=a-b;
		System.out.println(sub);
	}
	void sub(int a, int b,int c) {
		int sub=a-b-c;
		System.out.println(sub);
	}

	Subtraction(){
		System.out.println("Subtraction");
	}
}
