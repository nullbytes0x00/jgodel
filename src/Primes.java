public class Primes{
	public static boolean isPrime(int num){
		if (num <= 1){
			return false;
		}
		
		if (num == 2){
			return true;
		}
		
		for (int i=2; i<num; i++){
			if ((num % i) == 0){
				return false;
			}
		}

		return true;
	}
	
	public static int[] firstPrimes(int num){
		int[] prArray;
		prArray = new int[num];
		prArray[0] = 2;
		
		int idFilled = 1;
		int i = 2;
		
		while((idFilled+1) <= num)
		{
			i++;
			if (isPrime(i)){
				prArray[idFilled] = i;
				idFilled++;
			}
		}
		
		return prArray;
	}
}