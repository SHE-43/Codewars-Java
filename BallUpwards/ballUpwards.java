package BallUpwards;


public class ballUpwards 
{	
	public static int maxBall(int v0) 
	{
	    double h,t; h = 0; t = 0;
	    while (true)
	    {
	    	double height = ((v0 / 3.6) * t) - (0.5 * 9.81 * t * t);	    	
	    	if (height < h)
	    	{
	    		return (int) Math.round((t * 10) - 1);
	    	}	    	
	    	t += 0.1; h = height;	    	
	    }	        
	}
}
