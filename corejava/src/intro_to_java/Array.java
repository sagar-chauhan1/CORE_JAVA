package intro_to_java;

public class Array {
	
	void f1() {
		int arr[] = new int[3];
		arr[0]=4;
		arr[1]=3;
		arr[2]=8;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
