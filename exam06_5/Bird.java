package exam06_5;

public class Bird extends Pet{

	String color;
	
	public void fly() {
		System.out.println("Bird.run");
	}
	
	public Bird() {
		
	}
	public Bird(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	
	@Override
	public void eat() {
		System.out.println("Bird.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Bird.sleep");
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
}
