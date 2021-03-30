package Level_6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankersPlan_Test {

	@Test
	void test() 
	{
		BankersPlan bp = new BankersPlan();
		boolean output = bp.fortune(100000, 1, 9185, 12, 1);
		assertEquals(false, output);
	}
	
	@Test
	void test1() 
	{
		BankersPlan bp = new BankersPlan();
		boolean output = bp.fortune(100000, 1, 2000, 15, 1);
		assertEquals(true, output);
	}
	
	@Test
	void test2() 
	{
		BankersPlan bp = new BankersPlan();
		boolean output = bp.fortune(100000000, 1, 100000, 50, 1);
		assertEquals(true, output);
	}
	
	@Test
	void test3() 
	{
		BankersPlan bp = new BankersPlan();
		boolean output = bp.fortune(100000000, 1.5, 10000000, 50, 1);
		assertEquals(false, output);
	}
	
	@Test
	void test4() 
	{
		BankersPlan bp = new BankersPlan();
		boolean output = bp.fortune(100000000, 5, 1000000, 50, 1);
		assertEquals(true, output);
	}
	
	@Test
	void testFortune11() 
	{
		BankersPlan bp = new BankersPlan();
		boolean output = bp.fortune1(100000, 1, 9185, 12, 1);
		assertEquals(false, output);
	}
	
	@Test
	void testFortune12() 
	{
		BankersPlan bp = new BankersPlan();
		boolean output = bp.fortune1(100000, 1, 2000, 15, 1);
		assertEquals(true, output);
	}
	
	@Test
	void testFortune13() 
	{
		BankersPlan bp = new BankersPlan();
		boolean output = bp.fortune1(100000000, 1, 100000, 50, 1);
		assertEquals(true, output);
	}
	
	@Test
	void testFortune14() 
	{
		BankersPlan bp = new BankersPlan();
		boolean output = bp.fortune1(100000000, 1.5, 10000000, 50, 1);
		assertEquals(false, output);
	}
	
	@Test
	void testFortune15() 
	{
		BankersPlan bp = new BankersPlan();
		boolean output = bp.fortune1(100000000, 5, 1000000, 50, 1);
		assertEquals(true, output);
	}
}