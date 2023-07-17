package exam04_1;

public class TestPet {

	public static void main(String[] args) {
		
		// 고양이: 야옹이 2살 암컷
		// 생성자 이용하여 값초기화
		Cat cat = new Cat("야옹이", 2, "암컷");
		
		System.out.println(cat.name); // 멤버 접근(권장 안함)
		System.out.println(cat.age);
		System.out.println(cat.sex);
		
	}

}
