package exam08_1;

public class WrapperTest {

	public static void main(String[] args) {

		// 기본형 8개에 해당하는 클래스들 (Wrapper 클래스)
		
		// 1. int 범위(4byte)
		System.out.println("최소값:" + Integer.MIN_VALUE);
		System.out.println("최대값:" + Integer.MAX_VALUE);
		
		// 2. "10" --> 10
		System.out.println("정수 변환:" + (Integer.parseInt("10") + 1));
		
		// 3. "3.14" --> 3.14
		System.out.println("실수 변환:" + (Float.parseFloat("3.14") + 1)); // 실수 연산은 정확하게 떨어지지 않는다. ==> BigDecimal 이용
		
		// 4. 최대, 최소, 합계
		System.out.println(Integer.max(10, 20));
		System.out.println(Integer.min(10, 20));
		System.out.println(Integer.sum(10, 20));
	}

}
