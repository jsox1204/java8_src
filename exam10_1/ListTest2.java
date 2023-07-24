package exam10_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		
		// List계열: 순서가 있고 중복이 가능
		
		ArrayList<String> list2 = new ArrayList<>();
		List<String> list = new ArrayList<>(); // 다형성 적용 (매우 중요)
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동");
		
		// 메서드
		System.out.println("크기:" + list.size());
		
		// 수정
		list.set(1, "원균");
		
		// 삽입
		list.add(0, "강감찬");
		
		// 삭제
		list.remove(1); // 위치로 삭제
		list.remove("원균"); // 값으로 삭제, 일치하는 첫번째 값만 삭제, 모두 삭제하려면 removeAll
		
		// 부분리스트
		List<String> sublist = list.subList(0, 2); // 0 ~ 1
		System.out.println(sublist);
		
		// 출력방법1 -> toString()
		System.out.println(list);
		
		
	}
}
