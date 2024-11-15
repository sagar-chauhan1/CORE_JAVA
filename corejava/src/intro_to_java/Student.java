package intro_to_java;

public class Student {
	int studId;
	String studName;
	double studMark;
	public Student(int studId, String studName, double studMark) {
		this.studId = studId;
		this.studName = studName;
		this.studMark = studMark;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student Details : \n studId=" + studId + "\n studName=" + studName + "\n studMark=" + studMark ;
	}
	
}
