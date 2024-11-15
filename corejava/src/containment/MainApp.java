package containment;
import intro_to_java.MyDate;

public class MainApp {
	
	public static void main(String args[]) {
		MyDate d= new MyDate(9,8,1998);
		Employee emp = new Employee();
		System.out.println(emp);
		
		Employee emp1 = new Employee(34,"halk",40000,d);
		System.out.println(emp1);
	}

}
