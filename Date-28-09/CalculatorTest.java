package TestJunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Com.Bhavna.Maven.Junit.Calculator;


public class CalculatorTest {

	private static final int Calculator = 0;

	@Test
	public void testAdd() {
		// int expected=4;
		Calculator calc = new Calculator();
		int actual = calc.addition(2, 2);
		assertEquals(4, actual);
	}

	@Test
	public void testaddDouble() {
		double expected = 10.4;
		Calculator calc = new Calculator();
		double actual = calc.addition(5.0, 5.4);
		assertEquals(expected, actual, 0);

	}
	
	@Test
	public void testaddstrinng() {
		String expected ="MahatmaGadhi";
		Calculator calc = new Calculator();
		String actual = calc.addition("Mahatma", "Gadhi");
		assertEquals(expected,actual);			
	}
	@Test
	public void testMultiplication() {
		Calculator calc = new Calculator();
		int actual = calc.multiplication(5, 5);
		assertEquals(25, actual );
	}
	@Test
	public void testDivision() {
		Calculator calc = new Calculator();
		int actual =calc.division(10, 2);
		assertEquals(5,actual);
	}
}
