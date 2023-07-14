package workshop;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("한 자리 정수값을 입력하시오");
		int multInput = scanner.nextInt();
		
		System.out.print(multInput);
		for(int n = 1; n <= 100; n++) {
			if(n % multInput == 0) {
				sum += n;
				if(n != multInput) {
					System.out.print("+" + n);
				}
			}
		}
		System.out.print(" = " + sum);
	}
}
