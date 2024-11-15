package intro_to_java;

public class MyDate {
	
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month , int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public MyDate() {
		day = 9;
		month = 9;
		year = 9999;
	}

	@Override
	public String toString() {
		return "MyDate: \n" + day + "/" + month + "/" + year ;
	}

}
