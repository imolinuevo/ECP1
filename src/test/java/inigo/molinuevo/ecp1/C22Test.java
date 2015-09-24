package inigo.molinuevo.ecp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class C22Test {

	private C22 c22;

	@Test
	public void testMA() {
		c22 = new C22();
		assertEquals("mA", c22.mA());
	}

}
