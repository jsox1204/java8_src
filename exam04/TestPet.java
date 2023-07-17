package exam04;

// Cat과 같은 main 없는 재사용 클래스 관리목적
public class TestPet {

	public static void main(String[] args) {
		
		// 객체 생성
		// 클래스명 변수명 = new 클래스명();
		
		// 고양이: 야옹이 2살 암컷
		
		Cat cat = new Cat();
		
		// 멤버 접근(권장 하지 않음)
		cat.name = "야옹이";
		cat.age = 2;
		cat.sex = "암컷";
		
		// 고양이: 망치 1살 수컷
		Cat cat2 = new Cat();
		cat2.name = "망치";
		cat2.age = 1;
		cat2.sex = "수컷";
	}

}
