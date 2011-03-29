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
	
	@Test
	public void testTwo()
	{
		assertEquals(list(2),PrimeFactorization.generatePrimes(2));
	}
	
	@Test
	public void testThree()
	{
		assertEquals(list(3), PrimeFactorization.generatePrimes(2));
	}
	
	private ArrayList<Integer> list(int... ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : ints){
			ret.add(i);
		}
		return ret;
	}
}
