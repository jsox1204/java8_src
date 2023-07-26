package workshop07.sub02;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;

public class ListTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int size = 0;
		
		while(!(size >=5 && size <= 10)) {
			System.out.println("정수 입력(5~10)");
			size = scan.nextInt();
			if(!(size >=5 && size <= 10)) {
				System.out.println("다시 입력하세요");
			}
		}
		
		MakeList makList = new MakeList();
		makList.makeArrayList(size);
		
		
		for (Integer integer : makList.getList()) {
			System.out.print(integer + " ");
		}
		
		System.out.println();
		System.out.println("평균:" + makList.getAverage());
		
	}

}
