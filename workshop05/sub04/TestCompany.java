package workshop05.sub04;

import java.util.Scanner;

public class TestCompany {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력:");
		int salary = scan.nextInt();
		
		Company comp = new Company(salary);
		System.out.println("연 기본급 합:" + comp.getIncome() + " 세후:" + comp.getAfterTaxIncome());
		System.out.println("연 보너스 합" + comp.getBonus() + " 세후:" + comp.getAfterTaxBonus());
		System.out.println("연 지급액 합:" + (comp.getAfterTaxIncome() + comp.getAfterTaxBonus()));
	}

}
