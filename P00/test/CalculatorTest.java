import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
	}

	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
			
		int expected = 5555;
		assertEquals (expected, actual);
		}

	@Test
	public void testMultiple() {
		int a = 123;
		int b = 11;
			
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
			
		int expected = 1353;
		assertEquals (expected, actual);
	}

	@Test
	public void testDivide() {
		int a = 1353;
		int b = 11;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
			
		int expected = 123;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivide_Error() {
		try {
			int a = 123;
			int b = 0;

			Calculator cal = new Calculator();
			int actual = cal.divide(a, b);
				
			int expected = 123;
			assertEquals (expected, actual);

		} 
		catch (ArithmeticException ae) {
			System.out.println("Error! Cannot divide by 0!");
		}
	}
}
