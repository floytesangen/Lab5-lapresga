import java.util.ArrayList;


public class PrimeFactorization {
	public static ArrayList<Integer> generatePrimes(int i){
		ArrayList<Integer> ret;
	
		ret = new ArrayList<Integer>();
		for (int candidate = 2; i > 1; candidate++)
		{

			while(i % candidate == 0){
				ret.add(candidate);
				i /= candidate;
			}
		}
		
		if (i > 1)
		{
			ret.add(i);
		}
		return ret;
	}
}
