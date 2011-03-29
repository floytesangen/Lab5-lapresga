import java.util.ArrayList;


public class PrimeGeneration {

	public static Object generatePrimes(int i) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		if (i > 2) ret.add(2);
		for (int candidate = 2; candidate < i; candidate++)
		{

			
			for (int n = 2; n < candidate; n++)
			{

				if(candidate % n == 0){
					continue;
				}
				else{
					ret.add(candidate);
				}
			}
		}
		return ret;
	}

}
