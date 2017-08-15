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
		shapes.add(Rectangle.of(Length.of(3), Length.of(2)));
		shapes.add(Square.of(Length.of(3)));
		shapes.add(Circle.of(Length.of(3)));
	}
	
	@Test
	public void theSumOfTheAreasOfARectangleOfSides3And2ASquareOfSide3AndACircleOfRadius3Is43(){
		assertThat(ShapesOperations.sumOfAreas(shapes), is(43.27433388230814));		
	}
	
	@Test
	public void theSumOfThePerimetersOfARectangleOfSides3And2ASquareOfSide3AndACircleOfRadius3Is40(){
		assertThat(ShapesOperations.sumOfPerimeters(shapes), is(40.84955592153876));		
	}

}
