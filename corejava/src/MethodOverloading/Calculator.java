package MethodOverloading;

public class Calculator {

	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		a1.add(10, 20);
		a1.add(20, 3.2);
		a1.add(10, 20, 30);
		
		Subtraction s1 = new Subtraction();
		s1.sub(10, 20);
		s1.sub(20, 3.2);
		s1.sub(10, 20, 30);
		
		Multiplication m1 = new Multiplication();
		m1.mul(10, 20);
		m1.mul(20, 3.2);
		m1.mul(10, 20, 30);
		
		Division d1 = new Division();
		d1.div(10, 20);
		d1.div(20, 3.2);
		d1.div(30, 20, 10);

	}

}
