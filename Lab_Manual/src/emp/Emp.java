package emp;

public class Emp {
	
	public String name;
	public int id;
	public int sal;
	public int hra;
	public int da;
	
	public Emp(String name, int id, int sal, int hra, int da) {
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.hra = hra;
		this.da = da;
	}
	
	public void fun() {
		System.out.println(" Employee name = "+name+
				"\n Employee id = "+id +
				"\n salary = "+sal+
				"\n hra = "+hra+
				"\n da = "+da);
	}
	

}
