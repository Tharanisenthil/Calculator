package main;

import static org.junit.Assert.*;

import org.junit.Test;
import main.Calculator;

/*
 * CHANGING OF TEST FILES MAY LEAD TO DISQUALIFICATION OF PROJECTS !!!
 * 
 */

public class TestingCalc {
	Calculator c;
	@SuppressWarnings("static-access")
	@Test
	public void mul_test() {
		c = null;
		assertEquals(4*7,c.mult(4,7));
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void addition_test() {
		assertEquals(4+7,c.add(4,7));
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void sub_test() {
		assertEquals(4-7,c.sub(4,7));
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void div_test() {
		
		assertEquals(14/7,c.div(14,7));
	}

}