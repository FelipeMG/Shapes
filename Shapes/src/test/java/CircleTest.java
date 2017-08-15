import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CircleTest {

	@Test(expected = IllegalArgumentException.class)
	public void aCircleOfRadius0IsInvalid() {
		assertThat(Circle.of( Length.of(0) ).getArea(), is(0.0));
	}
	
	@Test
	public void theAreaOfACircleOfRadius3Is9Pi() {
		assertThat(Circle.of( Length.of(3) ).getArea(), is(9.0 * Math.PI));
	}
	
	@Test
	public void thePerimeterOfACircleOfRadius3Is6Pi() {
		assertThat(Circle.of( Length.of(3) ).getPerimeter(), is(6.0 * Math.PI));
	}
	
}
