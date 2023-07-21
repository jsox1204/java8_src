package workshop06.sub01;

public class Truck extends Car{

	public Truck() {
		
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	@Override
	public double getEfficiency() {
		// 현재 적재 중량 5kg 당 연비 0.2km를 감소시킨 값 리턴
		return super.getEfficiency() - ((getCurWeight() / 5) * 0.2);
	}
	
	@Override
	public void moving(int distance) {
		double restOil = getRestOil();
		
		restOil -= calcOil(distance);
		
		setRestOil(restOil);
	}
	
	private double calcOil(int distance) {
		return distance /getEfficiency();
	}
	
	public int getCost(int distance) {
		return ((int)calcOil(distance)) * 3000;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t\t%.1f", super.toString(), getEfficiency());
	}
}
