package es.hiiberia.simpatico.rest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpaticoResourceTwitterTest {

	@Test
	public void testSuma() {
		int a=3;
		int b=2;
		SimpaticoResourceTwitter sum1= new SimpaticoResourceTwitter();
		int c= sum1.suma(2, 3);
		assertEquals(c, 5);
	}

}
