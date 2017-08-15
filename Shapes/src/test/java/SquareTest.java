import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SquareTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void aSquareOfSide0IsInvalid() {
		assertThat(Square.of(Length.of(0)).getArea(), is(0.0));
	}
	
	@Test
	public void theAreaOfASquareOfSide4Is16() {
		assertThat(Square.of(Length.of(4)).getArea(), is(16.0));
	}
	
	@Test
	public void thePerimeterOfASquareOfSide3Is12() {
		assertThat(Square.of(Length.of(3)).getPerimeter(), is(12.0));
	}

}
