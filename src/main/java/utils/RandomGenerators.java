package utils;

public class RandomGenerators {

	public static int randomNumbers()
	{
		 int min = 1;
	      int max = 10000000;
	        
	      //Generate random int value from 1 to 10000000 
	      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
	      return random_int;
	}
}
