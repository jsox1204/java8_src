package exam08;

interface Flyer{
	public abstract void fly();
}

// 이름있는 클래스
class Bird implements Flyer{
	@Override
	public void fly() {
		System.out.println("Bird.fly");
	}
}
public class TestMain {

	public static void main(String[] args) {
		
		// 1. 이름있는 클래스 사용
		Flyer f = new Bird(); // 다형성
		f.fly();
		
		// 2. 익명 클래스
		/* 인터페이스명 변수명 = new 인터페이스명(){
				// 추상메서드 재정의
			};
		*/
		Flyer f2 = new Flyer() {
			
			@Override
			public void fly() {
				System.out.println("anonymous.fly");
			}
		};
		f2.fly();
		
	}

}
