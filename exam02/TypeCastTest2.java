package exam02;

public class TypeCastTest2 {

	public static void main(String[] args) {
		
		// 1. 묵시적 형변환(upcasting)
		
		// 가 byte -> short -> int -> long -> float -> double
		// 나. char -> int(아스키 코드값)
		// 다. int보다 작은 데이터형의 연산은 int로 반환
		// 라. 큰 타입과 작은 타입의 연산은 큰 타입으로 반환
		
		// 2. 명시적 형변환(downcasting) : (데이터타입) <= 형변환 연산자, 작은 타입 = (작은 타입)큰 타입
		int n = 10;
		short n2 = (short)n;
	}

}
