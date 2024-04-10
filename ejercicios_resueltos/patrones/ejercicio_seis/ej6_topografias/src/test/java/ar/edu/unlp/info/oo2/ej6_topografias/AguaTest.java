package ar.edu.unlp.info.oo2.ej6_topografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AguaTest {

	Agua agua;
	
	@BeforeEach
	void setUp() throws Exception {
		agua = new Agua();
	}

	@Test
	void testProporcionAgua() {
		assertEquals(1, agua.calcularProporcionDeAgua());
	}
	
	@Test
	void testProporcionTierra() {
		assertEquals(0, agua.calcularProporcionDeTierra());
	}
	
	@Test
	void testIsEquals() {
		assertTrue(agua.isEquals(new Agua()));
		assertFalse(agua.isEquals(new Tierra()));
		assertFalse(agua.isEquals(new Pantano()));
	}

}
