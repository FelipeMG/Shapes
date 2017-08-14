import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RectangleTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void invalidRectangle() {
		assertThat(Rectangle.of(0, 0).getArea(), is(0.0));
	}
	
	@Test
	public void validRectangleArea() {
		assertThat(Rectangle.of(2, 4).getArea(), is(8.0));
	}
	
	@Test
	public void validRectanglePerimeter() {
		assertThat(Rectangle.of(2, 4).getPerimeter(), is(12.0));
	}

}
