package inigo.molinuevo.ecp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class C52Test {

	private C52 c52;

	@Test
	public void testMA() {
		c52 = new C52();
		assertEquals("mA", c52.mA());
	}

}
