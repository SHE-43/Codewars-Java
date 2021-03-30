package Level_6;

public class A_Rule_of_Divisibility_by_13_best {

	public static void main(String[] args) 
	{
		int p = 10;
		int [] a = new int[]{1,10,9,12,3,4};
		System.out.println(a[p++%2]);
		System.out.println(p++ % 2);
		
		
		

	}
	
	private static final int[] seq = new int[]{1,10,9,12,3,4};
	
	public static long thirt(long n) {
	        
	        long v = 0, m = n;
	        int p = 0;
	        while (m>0) 
	        {
	            v += (m % 10) * seq[p++%6];
	            m /= 10;
	        }
	        return v == n ? v : thirt(v);
	        
	    }

}
