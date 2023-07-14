package workshop2;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int sum = 0;
		
		for(int n = 0; n < arr.length; n++) {
			if(n % 2 == 1) {
				sum += arr[n];
			}
		}
		System.out.println("sum=" + sum);
		
	}

}
