package workshop06.sub04;

public class Triangle extends Shape implements Resize{

	public Triangle() {
		
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	@Override
	public void setResize(int size) {
		super.setHeight(getHeight() + size);
	}

	@Override
	public double getArea() {
		return getWidth() * getHeight() * 0.5;
	}

	
}
