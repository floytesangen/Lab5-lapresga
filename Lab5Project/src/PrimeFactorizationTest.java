import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeFactorizationTest {
	@Test
	public void testJUnit()
	{
		assertTrue("Hello", true);
	}
	
	@Test
	public void testOne()
	{
		assertEquals(new ArrayList<Integer>(), PrimeFactorization.generatePrimes(1));
	}
	
}
