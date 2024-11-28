package wrapper;

public class StudentMain {
	public static void main(String args[]) {
		Student s = new Student();
		s.id = 1;
		StudentMain.fun(s);
		System.out.println(s.id);
	}
	
	public static void fun(Student a) {
//		Student s =new Student();
//		s.id = 2;
//		a = s;
		a.id = 2;
		
	}
}
