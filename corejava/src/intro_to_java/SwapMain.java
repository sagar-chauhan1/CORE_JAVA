package intro_to_java;

public class SwapMain {

	public static void main(String args[]) {
		
		Swap s1 = new Swap();
		Swap s2 = new Swap(1,1,2003);
		
		System.out.println("Before Swapping : \n");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("");
		
		SwapMain.swap(s1,s2);
	}
	
	public static void swap(Swap ss1 , Swap ss2) {
		Swap temp=ss1;
		ss1=ss2;
		ss2=temp;
		
		System.out.println("After Swapping : \n");
		System.out.println(ss1);
		System.out.println(ss2);
	}
}
