package exam06;

public class Dog {

	String name;
	int age;
	String sex;
	
	public void eat() {
		System.out.println("Dog.eat");
	}
	
	public void sleep() {
		System.out.println("Dog.sleep");
	}

	public Dog() {
		
	}

	public Dog(String name, int age, String sex) {
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
	
}
