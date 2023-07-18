package exam05_1;

public class Cat {
	
	private String name;
	private int age;
	private String sex;
	
	public Cat() {
		
	}

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
		info();
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
	
	// info메서드는 외부에서 사용하지 않는다.
	// Cat 클래스의 setName메서드만 사용
	// 외부에서 숨긴다.(복잡성 감소)
	private void info() {
		System.out.println("info");
	}
}
