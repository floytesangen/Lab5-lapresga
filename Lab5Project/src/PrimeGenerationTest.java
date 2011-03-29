import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeGenerationTest {
	@Test
	public void testJUnit()
	{
		assertTrue("Hello", true);
	}
	
	@Test
	public void testTwo()
	{
		assertEquals(new ArrayList<Integer>(), PrimeGeneration.generatePrimes(2));
	}

}
