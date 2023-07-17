package exam04_2;

public class TestPet {

	public static void main(String[] args) {
		
		Cat cat = new Cat(); // 기본 생성자는 명시적으로 생성자를 안 만든 경우에만 자동생성
		
		Cat cat2 = new Cat("야옹이", 2);
		
		Cat cat3 = new Cat("망치", 1, "수컷");
		
		/*
		 *  오버로딩 생성자 지원 이유?
		 *  - 다양한 방법으로 생성하도록 지원
		 *  
		 *  기본생성자
		 *  - 명시적으로 생성자를 안 만든 경우에만 자동 생성
		 *  따라서 기본생성자를 명시적으로 지정
		 */
	}

}
