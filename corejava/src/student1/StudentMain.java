package student1;

import java.util.Scanner;

public class StudentMain {
	public static int choice ;
	public static void main(String args[]) {
		System.out.println("Enter your choice"+
						"\n 1.add details"+
				"\n 2.update details"+
						"\n 3.delete details"+
				"\n 4.desplay details"+
						"\n 5.remove all details"+
				"\n 6.exit");
		Scanner s1 = new Scanner(System.in);
		int deta=s1.nextInt();
		
		do {
			Scanner s2 = new Scanner(System.in);
			System.out.println("enter student details : ");
			int id=s2.nextInt();
			String name = s2.next();
			double mark =s2.nextDouble();
			
			Student stu = new Student(id,name,mark);
			stu.fun1();
			
		}while(choice != 6);
	}

}
