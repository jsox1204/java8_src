package exam07_4;

public class Dog extends Pet {

	String sex;

	public void eatDog() {
		System.out.println("Dog.eat");
	}

	public void sleepDog() {
		System.out.println("Dog.sleep");
	}

	public Dog() {
		
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	public Dog(String name, int age, String sex) {
		super(name, age);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return String.format("Dog 이름: %s, Dog 나이:%d, Dog 성별:%s", name, age, sex);
	}
	
}
