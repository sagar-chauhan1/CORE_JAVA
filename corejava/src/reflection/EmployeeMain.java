package reflection;

import java.lang.reflect.*;
import java.lang.reflect.Method;

public class EmployeeMain {
	
	public static void main(String args[]) {
		try {
			Class empClass = Class.forName("reflection.Employee");
			
			System.out.println("Class Name : "+empClass.getName());
			System.out.println("Super Class : "+empClass.getSuperclass());
			System.out.println("Fields of Employee : ");
			
			Field[] fields = empClass.getDeclaredFields();
			for(Field field : fields) {
				System.out.println("Field Name : "+field.getName()+"\tDate Type : "+field.getType());
			}
			System.out.println("\n");
			System.out.println("Methods of Employee");
			Method[] methods = empClass.getDeclaredMethods();
			for(Method method : methods) {
				System.out.println("Method Name : "+method.getName()+"\tReturn Type : "+method.getReturnType());
			}
			System.out.println("\n");
			System.out.println("Constructors");
			Constructor[] constructors = empClass.getDeclaredConstructors();
			for(Constructor constructor : constructors) {
				System.out.println("Constructor Name : "+constructor.getName());
				System.out.println("Number of parameters : "+constructor.getParameterCount());
				
			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
