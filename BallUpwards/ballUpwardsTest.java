package BallUpwards;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ballUpwardsTest 
{
	@Test
	void test1() 
	{
		int INPUT = 37;
		int EXPECTEDOUTPUT = 10;
		int OUTPUT = ballUpwards.maxBall(INPUT);
		assertEquals(EXPECTEDOUTPUT, OUTPUT);
	}
	
	@Test
	void test2() 
	{
		int INPUT = 45;
		int EXPECTEDOUTPUT = 13;
		int OUTPUT = ballUpwards.maxBall(INPUT);
		assertEquals(EXPECTEDOUTPUT, OUTPUT);
	}
	
	@Test
	void test3() 
	{
		int INPUT = 99;
		int EXPECTEDOUTPUT = 28;
		int OUTPUT = ballUpwards.maxBall(INPUT);
		assertEquals(EXPECTEDOUTPUT, OUTPUT);
	}
	
	@Test
	void test4() 
	{
		int INPUT = 85;
		int EXPECTEDOUTPUT = 24;
		int OUTPUT = ballUpwards.maxBall(INPUT);
		assertEquals(EXPECTEDOUTPUT, OUTPUT);
	}
	
	@Test
	void test5() 
	{
		int INPUT = 136;
		int EXPECTEDOUTPUT = 39;
		int OUTPUT = ballUpwards.maxBall(INPUT);
		assertEquals(EXPECTEDOUTPUT, OUTPUT);
	}
	
	@Test
	void test6() 
	{
		int INPUT = 52;
		int EXPECTEDOUTPUT = 15;
		int OUTPUT = ballUpwards.maxBall(INPUT);
		assertEquals(EXPECTEDOUTPUT, OUTPUT);
	}
	
	@Test
	void test7() 
	{
		int INPUT = 16;
		int EXPECTEDOUTPUT = 5;
		int OUTPUT = ballUpwards.maxBall(INPUT);
		assertEquals(EXPECTEDOUTPUT, OUTPUT);
	}
}
