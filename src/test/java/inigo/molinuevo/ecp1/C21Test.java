package inigo.molinuevo.ecp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class C21Test {

private C21 c21;
	
	@Test
	public void testM1() {
		c21 = new C21();
		assertEquals("m1", c21.m1());
	}

	@Test
	public void testM2() {
		c21 = new C21();
		assertEquals("m2", c21.m2());
	}

}
