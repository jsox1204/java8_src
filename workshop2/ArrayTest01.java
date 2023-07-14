package workshop2;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		int avg = 0;
		
		for(int n: arr) {
			sum += n;
		}
		avg = sum / arr.length;
		
		System.out.println("sum="+ sum);
		System.out.println("avg="+ avg);
		
	}

}
