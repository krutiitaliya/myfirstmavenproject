package mavenpracticeproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class calculatertest {
	@Test
	public void testadd() {
		assertEquals(10,Calculater.add(5,5));
		assertEquals(-5,Calculater.add(-7,2));
}
	@Test
	public void testsubstract() {
		assertEquals(5,Calculater.substract(7,2));
		assertEquals(-2,Calculater.substract(-4,-2));
		}
	@Test
	public void testmultiply() {
		assertEquals(50,Calculater.multiply(10,5));
		assertEquals(-6,Calculater.multiply(2,-3));
	}
	@Test
	public void testdivide( ) {
		assertEquals(2,Calculater.divide(10,5));
		assertEquals(-3,Calculater.divide(-9,3));
	}
	}
