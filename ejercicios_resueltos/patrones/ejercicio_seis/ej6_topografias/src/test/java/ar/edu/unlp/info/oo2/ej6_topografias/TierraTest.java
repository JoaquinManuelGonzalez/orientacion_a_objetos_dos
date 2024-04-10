package ar.edu.unlp.info.oo2.ej6_topografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TierraTest {

	Tierra tierra;
	
	@BeforeEach
	void setUp() throws Exception {
		tierra = new Tierra();
	}

	@Test
	void testProporcionDeAgua() {
		assertEquals(0, tierra.calcularProporcionDeAgua());
	}
	
	@Test
	void testProporcionDeTierra() {
		assertEquals(1, tierra.calcularProporcionDeTierra());
	}
	
	@Test
	void testIsEquals() {
		assertTrue(tierra.isEquals(new Tierra()));
		assertFalse(tierra.isEquals(new Agua()));
		assertFalse(tierra.isEquals(new Pantano()));
	}

}
