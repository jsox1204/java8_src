package workshop06.sub04;

public class ShapeTest {

	public static void main(String[] args) {
	
		Shape[] shape = {
				new Triangle(7, 5, "Blue"),
				new Rectangle(4, 6, "Blue"),
				new Triangle(6, 7, "Red"),
				new Rectangle(8, 3, "Red"),
				new Triangle(9, 8, "White"),
				new Rectangle(5, 7, "White")
		};
		
		System.out.println("기본정보");
		
		for (int i = 0; i < shape.length; i++) {
			if(shape[i] instanceof Triangle) {
				System.out.println("Triangle" + "\t" + shape[i].getArea() + "\t" + shape[i].getColors());
			}
			if(shape[i] instanceof Rectangle) {
				System.out.println("Rectangle" + "\t" + shape[i].getArea() + "\t" + shape[i].getColors());
			}
		}
		
		for(Shape s: shape) {
			((Resize)s).setResize(5);
		}
		
		System.out.println();
		System.out.println("사이즈를 변경 후 정보");
		
		for (int i = 0; i < shape.length; i++) {
			if(shape[i] instanceof Triangle) {
				System.out.println("Triangle" + "\t" + shape[i].getArea() + "\t" + shape[i].getColors());
			}
			if(shape[i] instanceof Rectangle) {
				System.out.println("Rectangle" + "\t" + shape[i].getArea() + "\t" + shape[i].getColors());
			}
		}
	}
}
