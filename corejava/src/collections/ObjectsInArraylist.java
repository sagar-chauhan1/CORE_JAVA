package collections;
import java.util.*;

import reflection.Employee;

public class ObjectsInArraylist {
	
	public static void main(String args[]) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee emp1 = new Employee(12,"sagar",53330);
		empList.add(emp1);
		empList.add(new Employee(14,"jay",45556));
		empList.add(new Employee(40,"dharmik",21000));
		Employee emp2 =new Employee(32,"krupal",34000);
		Employee emp3 = new Employee(12,"hardik",64500);
		empList.add(emp2);
		empList.add(emp3);
		
		for(Employee emp:empList) {
			System.out.println(emp);
		}
	}
}
