package exam02;

public class OperatorTest {

	public static void main(String[] args) {
		
		// 1. 산술연산자
		int n = 10;
		int n2 = 3;
		
		System.out.println(n + n2);
		System.out.println(n - n2);
		System.out.println(n * n2);
		System.out.println(n / n2); // 몫만 반환
		System.out.println(n / (double) n2); // 소수점까지 반환
		System.out.println(n % n2);
		
		// + : 연결연산자로서 사용가능
		String k = 10 + 20 + 30 + "hello";
		String k2 = "hello" + 10 + 20 + 30;
		System.out.println(k);
		System.out.println(k2);
	}

}
