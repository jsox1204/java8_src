package workshop2;

import java.util.Random;

public class ArrayTest09 {

	public static void main(String[] args) {
		
		int[] arr3 = new int[5];
		Random rand = new Random();
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < arr3.length; i++) {
			int num = rand.nextInt(10) + 1;
			arr3[i] = num;
			System.out.print(num + " ");
		}
		System.out.println("");
		
		for(int x : arr3) {
			sum += x;
		}
		avg = sum / (double) arr3.length;
		
		System.out.println("sum=" + sum);
		System.out.println("avg=" + avg);
	}

}
