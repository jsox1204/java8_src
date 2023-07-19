package workshop05.sub08;

public class Coffee {

	private String name;
	private int price;
	
	public Coffee() {
		
	}

	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return name + " " + price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
