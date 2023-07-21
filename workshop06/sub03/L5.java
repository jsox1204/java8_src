package workshop06.sub03;

public class L5 extends Car implements Temp{

	public L5() {
		
	}

	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	@Override
	public void go(int distance) {
		super.setDistance(super.getDistance()+distance);
		int oilSize = super.getOilSize() - (distance / 8);
		super.setOilSize(oilSize);
	}

	@Override
	public void setOil(int oilsize) {
		int oil = super.getOilSize() + oilsize;
		super.setOilSize(oil);
	}

	@Override
	public int getTempGage() {
		int temp = (super.getDistance()/5);
		return temp;
	}

}
