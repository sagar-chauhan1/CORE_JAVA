package fileHandling;
import java.io.*;

public class SerializDemo implements Serializable{
	
	private int empId;
	private String empName;
	private double empSal;
	
	public SerializDemo () {
		super();
	}
	public SerializDemo (int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "SerializDemo [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
}
