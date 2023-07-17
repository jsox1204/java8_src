package exam04_4;

public class Cat {
	
	String name;
	int age;
	String sex;
	
	public Cat() {}

	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	// 오버로딩 메서드
	// 이름과 나이 한꺼번에 수정
	public void setCat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 나이와 성별 수정
	public void setCat(int age, String sex) {
		this.age = age;
		this.sex = sex;
	}
	
	// 이름, 나이, 성별 한꺼번에 수정
	public void setCat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	// getter+setter 기능 모두 포함
	public String getCat(String name, int age, String sex) {
		return name + " " + age + " " + sex; // 리컨값은 반드시 하나, 여러 값을 반환하고 싶다면 문자열이나 배열 사용
	}
	
	// 두 개의 정수(10, 20)을 한꺼번에 반환
	public int [] getInt() {
		return new int[] {10,20};
	}
	
	// 리턴타입은 void 인데  return 키워드 사용하는 경우
	public void xxx() {
		System.out.println("xxx1");
		if(true) return; // 중간에 xxx 메서드를 중지하고 반환한다.
		System.out.println("xxx2");
		System.out.println("xxx3");
	}
	
	// 자동형변환 byte -> short -> int -> long -> float -> double
	public void yyy(double n) { // int, long, float, double 모두 가능
		xxx(); //자신이 자신 안의 다른 메서드 호출 가능, this.xxx(); 와 동일
	}
}
