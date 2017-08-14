import java.util.List;

public final class ShapesOperations {
	
	private ShapesOperations() throws InstantiationException {
		throw new InstantiationException("class should not be instantiated");
	}
	
	public static double sumOfAreas(List<Shape> shapes) {
		double sum = 0;
		for(Shape s: shapes) {
			sum += s.getArea();
		}
		return sum;
	}
	
	public static double sumOfPerimeters(List<Shape> shapes) {
		double sum = 0;
		for(Shape s: shapes) {
			sum += s.getPerimeter();
		}
		return sum;
	}

}
