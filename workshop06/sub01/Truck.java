package workshop06.sub01;

public class Truck extends Car{

	public Truck() {
		
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	public double getEfficiency() {
		double efficiency = super.getEfficiency();
		int curWeight = getCurWeight();
		efficiency -= (curWeight / 5) * 0.2;
		return efficiency;
	}
	
	public void moving(int distance) {
		double restOil = getRestOil();
		
		restOil -= calcOil(distance);
		
		super.setRestOil(restOil);
	}
	
	public double calcOil(int distance) {
		double efficiency = getEfficiency();
		return distance / efficiency;
	}
	
	public int getCost(int distance) {
		return ((int)calcOil(distance)) * 3000;
	}
	
	@Override
	public String toString() {
		return String.format("%s \t %f", super.toString(), getEfficiency());
	}
}
