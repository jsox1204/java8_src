package workshop07.sub01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		HashSet<String> set = new HashSet<>();
		
		System.out.println("문자열 입력");
		String[] str = scan.nextLine().split("");
		
		System.out.println(Arrays.toString(str));
		
		for (String i : str) {
			set.add(i);
		}
		
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}
