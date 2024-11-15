package containment;
import intro_to_java.MyDate;

public class Employee {
	
	private int empId;
	private String empName;
	private double empSal;
	private MyDate joiningDate;
	
	public Employee() {
		empId = 123;
		empName = "sumit";
		empSal = 23000;
		joiningDate = new MyDate();
	}
	
	public Employee(int empId, String empName, double empSal, MyDate  joiningDate) {
		this.empId =empId;
		this.empName = empName;
		this.empSal = empSal;
		this.joiningDate = joiningDate;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", joiningDate="
				+ joiningDate + "]";
	}

}

	
