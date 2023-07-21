package exam01;

public class StringFormatTest {

	public static void main(String[] args) {
		
		// 포맷 출렷
		
		// 1. String.format(String 형식문자, Object ... 값들)
		String result = String.format("이름:%s, 나이:%d, 키:%.2f, 성별:%c, 결혼:%b", "홍길동", 20, 167.2389652, '남', true);
		System.out.println(result);
		
		// 2. System.out.printf(String 형식문자, Object ... 값들) Object는 모든 값(Object 클래스는 모든 클래스의 부모)
		System.out.printf("이름:%s, 나이:%d, 키:%.2f, 성별:%c, 결혼:%b \n", "홍길동", 20, 167.2389652, '남', true);
		System.out.printf("이름:%s, 나이:%d, 키:%.2f, 성별:%c, 결혼:%b", "홍길동", 20, 167.2389652, '남', true);
	}

}
