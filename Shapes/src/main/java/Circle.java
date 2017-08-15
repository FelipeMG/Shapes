
public class Circle implements Shape{
	
	private Length radius;
	
	private Circle(Length radius) {
		this.radius = radius;
	}
	
	public static Circle of(final Length radius) {
		return new Circle(radius);
	}

	public double getArea() {
		return this.radius.getMeasure() * this.radius.getMeasure() * Math.PI;
	}

	public double getPerimeter() {
		return 2 * Math.PI * this.radius.getMeasure();
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((radius == null) ? 0 : radius.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius == null) {
			if (other.radius != null)
				return false;
		} else if (!radius.equals(other.radius))
			return false;
		return true;
	}

}
