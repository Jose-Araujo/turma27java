package introducao;

import junit.framework.TestCase;

public class TesteSoma extends TestCase {
	
	Soma exemplo1 = new Soma();
	
	public void testSomar() {
		int somatorio = exemplo1.somar(10, 10);
		assertEquals(20,somatorio);
		assertEquals(10,somatorio);
	}

}
