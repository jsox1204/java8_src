package workshop2;

public class ArrayTest04 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int[] arr2 = new int[10];
		
		int index = 0;
		for(int n = arr.length - 1; n >= 0; n--) {
			arr2[index] = arr[n];
			index++;
		}
		
		for(int n = 0; n < arr2.length; n++) {
			System.out.print(arr2[n] + " ");
		}
		System.out.println("");
	}

}
