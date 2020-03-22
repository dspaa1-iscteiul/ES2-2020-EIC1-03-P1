/**
 * 
 */
package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author dariop
 *
 */
class CalculatorTest {
	
	static Calculator calc;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
	}

	/**
	 * Test method for {@link calculator.Calculator#main(java.lang.String[])}.
	 */
	@Test
	void testMain() {
		Calculator.main(null);
	}

	/**
	 * Test method for {@link calculator.Calculator#soma(int, int)}.
	 */
	@Test
	void testSoma() {
		assertEquals(10, calc.soma(4, 6));
		assertEquals(-3, calc.soma(3, -6));
	}

	/**
	 * Test method for {@link calculator.Calculator#subtracao(int, int)}.
	 */
	@Test
	void testSubtracao() {
		assertEquals(3, calc.subtracao(-3, -6));
	}

	/**
	 * Test method for {@link calculator.Calculator#multiplicacao(int, int)}.
	 */
	@Test
	void testMultiplicacao() {
		assertEquals(110, calc.multiplicacao(-10, -11));
	}

	/**
	 * Test method for {@link calculator.Calculator#quadrado(int)}.
	 */
	@Test
	void testQuadrado() {
		assertEquals(256, calc.quadrado(16));
	}

	/**
	 * Test method for {@link calculator.Calculator#isPar(int)}.
	 */
	@Test
	void testIsPar() {
		assertTrue(calc.isPar(-46));
		assertTrue(calc.isPar(46));
		assertTrue(calc.isPar(0));
		assertFalse(calc.isPar(1));
		assertFalse(calc.isPar(111));
	}

}
