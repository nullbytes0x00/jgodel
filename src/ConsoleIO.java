import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleIO{
	public static void main (String args[]) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the amount of integers to encode:\n");
		
		String str = "";
		str = reader.readLine();
		int i = 0;
		i = Integer.parseInt(str);
		
		int[] nArray = new int[i];

		System.out.print("Enter the integers to encode.\n");
		
		int iN = 0;
		
		while((iN+1) <= i){
			str = reader.readLine();
			nArray[iN] = Integer.parseInt(str);
			iN++;
		}

		System.out.print(Godel.godelEncoding(nArray, Primes.firstPrimes(i+1)) + "\n");
	}
}