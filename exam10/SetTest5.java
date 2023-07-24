package exam10;

import java.util.HashSet;
import java.util.Set;

public class SetTest5 {

	public static void main(String[] args) {
		
		// Set 계열: 순서가 없고 중복 불가한 자료구조
		HashSet<String> set2 = new HashSet<>();
		Set<String> set = new HashSet<>(); // 다형성 적용 (매우 중요)
		
		// 가정: 이름만 저장할 것이다.
		set.add("홍길동1");
		set.add("홍길동2");
		set.add("홍길동3");
		
		// set의 메서드
		System.out.println("크기:" + set.size());
		System.out.println("값 존재 여부:" + set.contains("홍길동1"));
		System.out.println("값 존재 여부:" + set.contains("이순신"));
		System.out.println("비어있냐?:" + set.isEmpty());
		
		set.remove("홍길동3"); // 홍길동3 삭제
		
		set.clear(); // 전체 삭제
		
		// 출력방법1 - toString()
		System.out.println(set);
		
		
	}

}
