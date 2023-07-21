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
		// 오일 탱크 크기를 넘지 않을 때만 오일 추가
		if((restOil + oil) <= getOilTankSize()) {
			restOil += oil;
		}
	}
	
	public void moving(int distance) {
		restOil -= (distance / getEfficiency());
	}
	
	public void addWeight(int weight) {
		// 최대적재중량을 넘지 않을 때만 중량 추가
		if((curWeight + weight) <= getMaxWeight()) {
			curWeight += weight;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s\t\t%.1f\t %d", super.toString(), restOil, curWeight);
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
