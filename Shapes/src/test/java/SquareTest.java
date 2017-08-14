import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SquareTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void invalidSquare() {
		assertThat(Square.of(0).getArea(), is(0.0));
	}
	
	@Test
	public void validSquareArea() {
		assertThat(Square.of(4).getArea(), is(16.0));
	}
	
	@Test
	public void validSquarePerimeter() {
		assertThat(Square.of(3).getPerimeter(), is(12.0));
	}

}
