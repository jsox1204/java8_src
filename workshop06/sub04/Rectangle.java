package workshop06.sub04;

public class Rectangle extends Shape implements Resize{

	public Rectangle() {
		
	}

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	@Override
	public void setResize(int size) {
		super.setWidth(super.getWidth() + size);
	}

	@Override
	public double getArea() {
		return super.getWidth() * super.getHeight();
	}

	
}
