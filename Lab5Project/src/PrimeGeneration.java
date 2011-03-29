import java.util.ArrayList;


public class PrimeGeneration {

	public static Object generatePrimes(int i) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		for (int candidate = 2; candidate < i; candidate++)
		{
			if (PrimeFactorization.generatePrimes(candidate).size() == 1)
			{
				ret.add(candidate);
			}
		}
		return ret;
	}

}
