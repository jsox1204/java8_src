package workshop06.sub01;

public class Car extends Vehicle{

	private double restOil;
	private int curWeight;
	
	public Car() {
		
	}

	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	public void addOil(int oil) {
		restOil += oil;
		double OilTankSize = getOilTankSize();
		
		if(restOil > OilTankSize) {
			restOil = OilTankSize;
		}
	}
	
	public void moving(int distance) {
		double efficiency = getEfficiency();
		restOil -= distance * efficiency;
	}
	
	public void addWeight(int weight) {
		curWeight += weight;
		double maxWeight = getMaxWeight();
		
		if(curWeight > maxWeight) {
			curWeight = (int) maxWeight;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s \t %f \t %d", super.toString(), restOil, curWeight);
	}

	public double getRestOil() {
		return restOil;
	}

	public int getCurWeight() {
		return curWeight;
	}

	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}
	
}
