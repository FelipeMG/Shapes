import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CircleTest {

	@Test(expected = IllegalArgumentException.class)
	public void invalidCircle() {
		assertThat(Circle.of(0).getArea(), is(0.0));
	}
	
	@Test
	public void validCircleArea() {
		assertThat(Circle.of(3).getArea(), is(9.0 * Math.PI));
	}
	
	@Test
	public void validCirclePerimeter() {
		assertThat(Circle.of(3).getPerimeter(), is(6.0 * Math.PI));
	}
	
}
