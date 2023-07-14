package workshop;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 총합 구하기");
		
		
		do {
			System.out.print("n 값:");
			num = scanner.nextInt();
		}while(num <= 0);
		
		for(int n = 1; n <= num; n++) {
			sum += n;
		}
		
		System.out.println("1부터 " + num + "까지의 총합: " + sum);
	}
}
