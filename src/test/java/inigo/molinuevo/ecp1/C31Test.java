package inigo.molinuevo.ecp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class C31Test {

	private C31 c31;

	@Test
	public void testM1() {
		c31 = new C31();
		assertEquals("m1", c31.m1());
	}

	@Test
	public void testM2() {
		c31 = new C31();
		assertEquals("m2", c31.m2());
	}
	
	@Test
	public void testMB() {
		c31 = new C31();
		assertEquals("mB", c31.mB());
	}

}
