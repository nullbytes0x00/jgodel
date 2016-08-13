public class Godel{
	static int godelEncoding(int[] numArray, int[] firstPrimes){
		
		int godelNum = 0;
		
		for (int i=0; i<numArray.length; i++){
			if (i == 0){
				godelNum = (int)java.lang.Math.pow(firstPrimes[i],numArray[i]);
			}
			else{
				godelNum = godelNum*((int)java.lang.Math.pow(firstPrimes[i],numArray[i]));
			}
		}
		
		return godelNum;
		
	}
}