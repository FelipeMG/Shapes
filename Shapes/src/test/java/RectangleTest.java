import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RectangleTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void aRectangleOfSide0IsInvalid() {
		assertThat(Rectangle.of( Length.of(0) , Length.of(0) ).getArea(), is(0.0));
	}
	
	@Test
	public void theAreaOfARectangleOfSides2And4Is8() {
		assertThat(Rectangle.of( Length.of(2) , Length.of(4) ).getArea(), is(8.0));
	}
	
	@Test
	public void thePerimeterOfARectangleOfSides2And4Is12() {
		assertThat(Rectangle.of( Length.of(2) , Length.of(4) ).getPerimeter(), is(12.0));
	}

}
