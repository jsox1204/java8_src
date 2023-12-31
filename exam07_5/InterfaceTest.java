package exam07_5;

// 인터페이스
interface Y1{
	
	// 1. 상수
	final int NUM = 10; // 상수, 자동으로 public static final이 지정
	int SIZE = 20; // 자동으로 public static final이 지정
	public static final int COUNT = 30; // 권장
	
	// 2. 추상 메서드 (인터페이스를 사용하는 가장 큰 목적)
	public abstract void a(); // 권장
	public void a2(); // 자동으로 public abstract 지정
	void a3(); // default 접근지정자가 아닌 public이다.
	
	// 3. Default 메서드
	public default void b() {
		System.out.println("defalut 메서드");
	}
	
	// 4. Static 메서드
	public static void c() {
		System.out.println("static 메서드");
	}
}

interface Y2{
	
	public abstract void x();
}

class K implements Y2{ // 구현

	@Override
	public void x() {
		
	} 
	
}

class K2 implements Y2, Y3{ // 다중 구현

	@Override
	public void x2() {
		
	}

	@Override
	public void x() {
		
	}
	
}

// 인터페이스 간 상속 (다중상속)
interface Y4 extends Y2, Y3{
	
}

// 상속 및 구현
class K3 extends Object implements Y2, Y3{

	@Override
	public void x2() {
		
	}

	@Override
	public void x() {

	}
	
}

interface Y3{
	public abstract void x2();
}

class Z implements Y1{

	@Override
	public void a() {
		System.out.println("a");
	}

	@Override
	public void a2() {
		System.out.println("a2");
	}

	@Override
	public void a3() {
		System.out.println("a3");
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		
//		Y2 y = new Y2(); // new 불가
		
		K k = new K();
		k.x();
		
		// 다형성
		Y2 k2 = new K();
		k2.x();
		
		Z z = new Z();
		z.a();
		z.a2();
		z.a3();
		System.out.println(Y1.NUM);
		System.out.println(Y1.SIZE);
		System.out.println(Y1.COUNT);
		z.b(); // default 메서드는 일반메서드의 concrete 메서드처럼 사용
		
		Y1.c(); // static 메서드
	}

}
