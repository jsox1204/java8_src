package workshop2;

import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		
		int population = 0; // 사람 수
		Scanner scan = new Scanner(System.in);
		int maxHeight = 0; // 사람 키의 최댓값
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수:");
		population = scan.nextInt();
		
		int[] arrHeight = new int[population];
		
		for(int i = 0; i < population; i++) {
			System.out.print("사람 " + (i + 1) + ":");
			arrHeight[i] = scan.nextInt();
		}
		
		for(int x: arrHeight) {
			if(maxHeight < x) {
				maxHeight = x;
			}
		}
		
		System.out.println("최댓값은 " + maxHeight + "입니다.");
	}

}
