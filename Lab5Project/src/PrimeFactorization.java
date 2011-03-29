import java.util.ArrayList;


public class PrimeFactorization {
	public static ArrayList<Integer> generatePrimes(int i){
		ArrayList<Integer> ret;
	
		ret = new ArrayList<Integer>();
		
		if (i % 2 == 0){
			ret.add(2);
			i /= 2;
		}
		
		if (i > 1)
		{
			ret.add(i);
		}
		return ret;
	}
}
