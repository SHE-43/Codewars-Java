package Level_6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class A_Rule_of_Divisibility_by_13_Test 
{
	@Test
	void test() {
		A_Rule_of_Divisibility_by_13 test = new A_Rule_of_Divisibility_by_13();
		
		long output = A_Rule_of_Divisibility_by_13.thirt(8529);
		assertEquals(79, output);
	}
	
	@Test
	void test1() {
		A_Rule_of_Divisibility_by_13 test = new A_Rule_of_Divisibility_by_13();
		
		long output = A_Rule_of_Divisibility_by_13.thirt(85299258);
		assertEquals(31, output);
	}
	
	@Test
	void test2() {
		A_Rule_of_Divisibility_by_13 test = new A_Rule_of_Divisibility_by_13();
		
		long output = A_Rule_of_Divisibility_by_13.thirt(5634);
		assertEquals(57, output);
	}
	
	@Test
	void test3() {
		A_Rule_of_Divisibility_by_13 test = new A_Rule_of_Divisibility_by_13();
		
		long output = A_Rule_of_Divisibility_by_13.thirt(1111111111);
		assertEquals(71, output);
	}
	
	@Test
	void test4() {
		A_Rule_of_Divisibility_by_13 test = new A_Rule_of_Divisibility_by_13();
		
		long output = A_Rule_of_Divisibility_by_13.thirt(987654321);
		assertEquals(30, output);
	}


}
