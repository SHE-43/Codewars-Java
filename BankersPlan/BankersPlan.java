package Level_6;

import java.util.Arrays;

public class BankersPlan 
{
	// My answer - passes all tests in CodeWars.
	public static boolean fortune(int f0, double p, int c0, int n, double i) 
	{
		for (int x = 0; x < n; x++)
		{			
			
			f0 = (int) ((f0 * (1 + p/100)) - (c0));			
			c0 = (int) (c0 + (c0 * 0.01));
			if (f0 < 0)
				return false;										
		}			
		return true;		
	}
	
	
	// Best rated answer.
	public static boolean fortune1(int f0, double p, int c0, int n, double i) 
	{
        int[][] data = new int[n][2];      
        
        data[0] = new int[]{ f0, c0 };
        for (int j = 1; j < n; j++) {
            int f = (int) (data[j - 1][0] * (1 + p / 100) - data[j - 1][1]);
            int c = (int) (data[j - 1][1] * (1 + i / 100));         
            data[j] = new int[]{ f, c };
            if (f < 0) {
                return false;
            }
        }
        return true;
    }
}