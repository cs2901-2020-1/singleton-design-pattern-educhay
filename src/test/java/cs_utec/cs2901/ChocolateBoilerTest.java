package cs_utec.cs2901;

import org.junit.Test;
import static org.junit.Assert.*;

public class ChocolateBoilerTest {
	@Test
	public void test() {
		ChocolateBoiler cb = new ChocolateBoiler();

		// check empty
		assertTrue(cb.isEmpty());
		
		// check boiled
		assertFalse(cb.isBoiled());

		// check fill
		cb.fill();

		assertFalse(cb.isEmpty());
		assertFalse(cb.isBoiled());

		// check boil
		cb.boil();

		assertTrue(cb.isBoiled());

		// check drain
		cb.drain();

		assertTrue(cb.isEmpty());

	} 
}
