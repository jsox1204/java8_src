package exam04_3;

public class TestPet {

	public static void main(String[] args) {
		
		Cat cat = new Cat("야옹이", 2, "암컷");
		
		// 출력1 - 인스턴스 변수 직접 접근
		System.out.println(cat.name);
		System.out.println(cat.age);
		System.out.println(cat.sex);
		
		// 출력2- getter 메서드 이용 접근
		String name = cat.getName();
		System.out.println(name);
		
		// 나이얻기
		int age = cat.getAge();
		System.out.println(age);
		// 성별얻기
		System.out.println(cat.sex);
		
		// 수정1- 인스턴스 변수 직접 접근 (권장 X)
		cat.age = 3;
		System.out.println(cat.age);
		
		// 수정2 - setter 메서드 이용
		cat.setAge(3);
		cat.setName("망치");
		cat.setSex("수컷");
		System.out.println(cat.getName());
		System.out.println(cat.getAge());
		System.out.println(cat.getSex());
	}

}
