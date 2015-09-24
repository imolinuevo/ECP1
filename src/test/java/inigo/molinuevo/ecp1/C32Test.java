package inigo.molinuevo.ecp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class C32Test {

	private C32 c32;

	@Test
	public void testMA() {
		c32 = new C32();
		assertEquals("mA", c32.mA());
	}

}
