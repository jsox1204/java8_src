package exam10_3;

import java.util.HashMap;

public class MapTest2 {

	public static void main(String[] args) {
		
		// Map은 순서가 없다.
		HashMap<String, String> map = new HashMap<>();
		
		map.put("p1", "홍길동");
		map.put("p2", "이순신");
		map.put("p3", "유관순");
		map.put("p3", "강감찬"); // key 중복 시 덮어쓴다.
		
		// 메서드
		System.out.println(map.size()); // 길이
		map.replace("p3", "세종"); // 치환
		
		map.remove("p3");
		map.clear(); // 전체 삭제
		
		// 출력방법 1 - toString
		System.out.println(map); // {p1=홍길동, p2=이순신, p3=유관순}
		
		
 	}

}
