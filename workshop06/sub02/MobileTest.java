package workshop06.sub02;

public class MobileTest {

	public static void main(String[] args) {
		
		Ltab ltab = new Ltab("Ltab", 500, "AP-01");
		Otab otab = new Otab("Otab", 1000, "AND-20");

		System.out.println("Mobile\t\tBattery\t\tOs");
		System.out.println("-----------------------------------------------");
		System.out.println(ltab);
		System.out.println(otab);
		
		// 10분  충전
		ltab.charge(10);
		otab.charge(10);
		
		System.out.println();
		System.out.println("10분 충전");
		System.out.println("Mobile\t\tBattery\t\tOs");
		System.out.println("-----------------------------------------------");
		System.out.println(ltab);
		System.out.println(otab);
		
		// 5분 충전
		ltab.operate(5);
		otab.operate(5);
		
		System.out.println();
		System.out.println("5분 통화");
		System.out.println("Mobile\t\tBattery\t\tOs");
		System.out.println("-----------------------------------------------");
		System.out.println(ltab);
		System.out.println(otab);
	}

}
