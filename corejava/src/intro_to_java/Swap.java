package intro_to_java;

public class Swap {
	int day;
	int month;
	int year;

	public Swap(){
		day = 2;
		month = 4;
		year = 2008;
		
	}
	public Swap(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date : " + day + "/" + month +  "/" + year ;
	}
	
	
}
