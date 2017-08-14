
public class Square implements Shape {

	private Length side;
	
	private Square(final Length side) {
		this.side = side;
	}
	
	public Length getSide() {
		return this.side;
	}
	
	public static Square of(final double side) {
		return new Square(Length.of(side));
	}
	
	public double getArea() {
		return side.getMeasure() * side.getMeasure();
	}

	public double getPerimeter() {
		return side.getMeasure() * 4;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((side == null) ? 0 : side.hashCode());
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
		Square other = (Square) obj;
		if (side == null) {
			if (other.side != null)
				return false;
		} else if (!side.equals(other.side))
			return false;
		return true;
	}

}
