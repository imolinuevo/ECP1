package inigo.molinuevo.ecp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class C12Test {

	private C12 c12;

	@Test
	public void testMA() {
		c12 = new C12();
		assertEquals("mA", c12.mA());
	}

}
