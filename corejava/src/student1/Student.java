package student1;

public class Student {
	
	public int studId;
	public String studName;
	public double studMark;

	public Student(int studId, String studName, double studMark) {
		this.studId = studId;
		this.studName = studName;
		this.studMark = studMark;
	}
	
	public void fun1() {
		System.out.println("student Id : "+studId);
		System.out.println("student Name : "+studName);
		System.out.println("student Mark : "+studMark);
		
	}
}
