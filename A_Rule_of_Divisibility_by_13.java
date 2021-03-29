package Level_6;

import java.util.ArrayList;
import java.util.List;

//# Upload on Github
//Get best answer
//Do tests
// Try 

// The number 4 as a character is also a ascii character!

public class A_Rule_of_Divisibility_by_13 {

	public static void main(String[] args) 
	{
		
//		List<Long> allInputs = 
//				new ArrayList<Long>(List.of(987654321,
//								1111111111,
//								5634,
//								85299258,
//								8529,
//								1234567));
//		
		List<Integer> L = List.of(
				987654321,
				1111111111,
				5634,
				85299258,
				8529,
				1234567);
		
	
		L.forEach(x -> System.out.println(thirt(x)));
		
	}	
    
    public static long thirt(long a) 
    {
		StringBuilder string_a = new StringBuilder(Long.toString(a)).reverse();
		long total = 0;
		for (int x = 0; x < string_a.length(); x++)
		{
			total += (Character.getNumericValue(string_a.charAt(x))
					* ((long) Math.pow(10, x) % 13));
		}
		return a == total ? total : thirt(total);
    }

}
