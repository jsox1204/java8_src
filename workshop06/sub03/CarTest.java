package workshop06.sub03;

public class CarTest {

	public static void main(String[] args) {
		
		Car[] car = {
				new L3("L3", "1500", 50, 25, 0),
				new L5("L5", "2000", 70, 35, 0)
		};
		
		System.out.println("vehicleName\tengineSize\toilTank\t   oilSize     distance\t  temperature");
		System.out.println("---------------------------------------------------------------------------------");
		
		for(Car c:car) {
			System.out.println(String.format("%s\t\t%s\t\t%d\t   %d\t\t%d\t   %d", c.getName(),c.getEngine(),c.getOilTank(),c.getOilSize(),c.getDistance(),((Temp) c).getTempGage()));
		}
		
		// 각각의 자동차에 25씩 주유
		car[0].setOil(25);
		car[1].setOil(25);
		
		System.out.println();
		System.out.println("25 주유");
		System.out.println("vehicleName\tengineSize\toilTank\t   oilSize     distance\t  temperature");
		System.out.println("---------------------------------------------------------------------------------");
		
		for(Car c:car) {
			System.out.println(String.format("%s\t\t%s\t\t%d\t   %d\t\t%d\t   %d", c.getName(),c.getEngine(),c.getOilTank(),c.getOilSize(),c.getDistance(),((Temp) c).getTempGage()));
		}
		
		// 각각의 자동차가 80씩 주행
		car[0].go(80);
		car[1].go(80);
		
		System.out.println();
		System.out.println("80 주행");
		System.out.println("vehicleName\tengineSize\toilTank\t   oilSize     distance\t  temperature");
		System.out.println("---------------------------------------------------------------------------------");
		
		for(Car c:car) {
			System.out.println(String.format("%s\t\t%s\t\t%d\t   %d\t\t%d\t   %d", c.getName(),c.getEngine(),c.getOilTank(),c.getOilSize(),c.getDistance(),((Temp) c).getTempGage()));
		}
	}

}
