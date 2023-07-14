package workshop;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("세 정수의 최대값 구하기");
		
		System.out.println("a 값");
		num1 = scanner.nextInt();
		
		System.out.println("b 값");
		num2 = scanner.nextInt();
		
		System.out.println("c 값");
		num3 = scanner.nextInt();
		
		if(num1 >= num2) {
			max = num1;
		}else {
			max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		
		System.out.println("최대값: " + max);
	}

}
