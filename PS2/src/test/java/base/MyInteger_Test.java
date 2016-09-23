package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
 
public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		MyInteger ivalue1 = new MyInteger(100);
		// Test for isPrime(MyInteger) method
		assertFalse(MyInteger.isPrime(ivalue1));
		assertTrue(MyInteger.isPrime(97));
		// Test for isPrime() method
		assertEquals(false, ivalue1.isPrime());
		assertEquals(false, ivalue1.isPrime());
		// Test for isPrime(int) method
		assertEquals(true, MyInteger.isPrime(23));
		
		// Test for isEven(MyInteger) method
		assertEquals(true, MyInteger.isEven(ivalue1));
		// Test for isEven(int) method
		assertEquals(false, MyInteger.isEven(103));
		// Test for isEven() method
		assertEquals(true, ivalue1.isEven());
		
		// Test for isOdd(MyInteger) method
		assertEquals(false, MyInteger.isOdd(ivalue1));
		// Test for isOdd(int) method
		assertEquals(true, MyInteger.isOdd(151));
		// Test for isOdd() method
		assertEquals(false, ivalue1.isOdd());
		
		// Test for equals(int) method
		assertEquals(false, equals(100));
		// Test for equals(MyInteger) method
		assertFalse(equals(new MyInteger(100)));
	}

}
