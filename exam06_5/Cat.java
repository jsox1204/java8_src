package exam06_5;

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
		
	}
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
}	
