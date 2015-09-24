package inigo.molinuevo.ecp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class C11Test {

	private C11 c11;

	@Test
	public void testM1() {
		c11 = new C11();
		assertEquals("m11", c11.m1());
	}

	@Test
	public void testM2() {
		c11 = new C11();
		assertEquals("m2", c11.m2());
	}

}
