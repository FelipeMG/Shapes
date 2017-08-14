public class Rectangle implements Shape{

	private Length width;
	private Length height;

	private Rectangle(Length width, Length height) {
		this.width = width;
		this.height = height;
	}
	
	public static Rectangle of(double width, double height) {
		return new Rectangle(Length.of(width), Length.of(height));
	}
	
	public Length getWidth() {
		return width;
	}

	public Length getHeight() {
		return height;
	}

	public double getArea() {
		return this.width.getMeasure() * this.height.getMeasure();
	}

	public double getPerimeter() {
		return 2 * (this.width.getMeasure() + this.height.getMeasure());
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((width == null) ? 0 : width.hashCode());
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
		Rectangle other = (Rectangle) obj;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
			return false;
		return true;
	}

}
