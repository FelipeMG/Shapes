import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ShapesOperationsTest {
	
	List<Shape> shapes = new ArrayList<Shape>();
	
	@Before
	public void appendShapes() {
		shapes.add(Rectangle.of(3, 2));
		shapes.add(Square.of(3));
		shapes.add(Circle.of(3));
	}
	
	@Test
	public void sumOfAreasValid(){
		assertThat(ShapesOperations.sumOfAreas(shapes), is(43.27433388230814));		
	}
	
	@Test
	public void sumOfPerimetersValid(){
		assertThat(ShapesOperations.sumOfPerimeters(shapes), is(40.84955592153876));		
	}

}
