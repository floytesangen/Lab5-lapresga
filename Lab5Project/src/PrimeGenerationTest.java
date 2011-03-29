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

	@Test
	public void testThree()
	{
		assertEquals(list(2),PrimeGeneration.generatePrimes(3));
	}
	
	@Test
	public void testFour()
	{
		assertEquals(list(2, 3), PrimeGeneration.generatePrimes(4));
	}
	
	@Test
	public void testLarge()
	{
		assertEquals(list(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97),PrimeGeneration.generatePrimes(100));
	}
	
	private ArrayList<Integer> list(int... ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : ints){
			ret.add(i);
		}
		return ret;
	}
}
