package workshop2;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		int[][] arr2 = {{ 5, 5, 5, 5, 5},{10,10,10,10,10},{20,20,20,20,20},{30,30,30,30,30}};
		int total = 0;
		double average = 0;
		int count = 0;
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				total += arr2[i][j];
			}
		}
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				count += 1;
			}
		}
		
		average = total / (double) count;
		
		System.out.println("total=" + total);
		System.out.println("average=" + average);
	}

}
