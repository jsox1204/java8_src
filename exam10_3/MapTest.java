package exam10_3;

import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		// Map은 순서가 없다.
		HashMap<String, String> map = new HashMap<>();
		
		map.put("p1", "홍길동");
		map.put("p2", "이순신");
		map.put("p3", "유관순");
		map.put("p3", "강감찬"); // key 중복 시 덮어쓴다.
		
		// 출력방법 1 - toString
		System.out.println(map); // {p1=홍길동, p2=이순신, p3=유관순}
		
		// 출력방법 2 - get(key)
		System.out.println(map.get("p1")); // 홍길동
		System.out.println(map.get("p2"));
		System.out.println(map.get("x")); // key가 없으면 null
		
		// 출력방법 3 - keySet() ==> key값읋 반환 (주로 key가 많을 때)
		Set<String> keys = map.keySet();
		System.out.println(keys);
		for (String key : keys) {
			System.out.println(key + "\t" + map.get(key));
		}
 	}

}
