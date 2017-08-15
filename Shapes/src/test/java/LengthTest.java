import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class LengthTest {
	
	@Test
	public void aPositiveLengthIsValid(){
		assertThat(Length.of(3).getMeasure(), is(3.0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void aNegativeLengthIsInvalid(){
		assertThat(Length.of(-3).getMeasure(), is(-3.0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void aLengthOfZeroIsInvalid(){
		assertThat(Length.of(0).getMeasure(), is(0.0));
	}

}
