package exam06_4;

// Cat is a Pet ==> 상속관계
public class Cat extends Pet{
	
	public void run() {
		System.out.println("Cat.run");
	}
	
	// 메서드 재정의 (overriding)
	@Override // @으로 시작하는 코드를 어노테이션(annotation)이라고 부른다., 재정의라는 것을 알려주며  재정의 규칙에 맞게끔 강제한다.
	public void eat() {
		System.out.println("Cat.eat");
	}
	
	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}

	public Cat() {
		// 첫라인에서 super([값,,,]); 사용가능
		super(); // 자동생성, 부모의 기본생성자 호출하는 코드
		System.out.println("Cat 생성자");
	}
	
	public Cat(String name, int age) {
		// 부모에서 선언한 변수를 부모가 초기화
		super(name,age);
		System.out.println("Cat 생성자2");
		
		// 부모에서 선언한 변수를 자식이 초기화
//		this.name = name;
//		this.age = age;
	}
	
}	
