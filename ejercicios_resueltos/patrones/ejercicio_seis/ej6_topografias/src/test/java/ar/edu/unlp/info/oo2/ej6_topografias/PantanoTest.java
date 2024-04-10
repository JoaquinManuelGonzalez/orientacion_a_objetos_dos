package ar.edu.unlp.info.oo2.ej6_topografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PantanoTest {
	
	Pantano pantano;

	@BeforeEach
	void setUp() throws Exception {
		pantano = new Pantano();
	}

	@Test
	void testProporcionDeAgua() {
		assertEquals(0.7, pantano.calcularProporcionDeAgua());
	}
	
	@Test
	void testProporcionDeTierra() {
		/*
		 * Lo pongo asi porque a Java le cuesta hacer operaciones
		 * en punto flotante (1 - 0.7) debería de dar 0.3 pero por las
		 * limitaciones que ocurren al representar números con decimales en
		 * binario, Java encuentra a "0.30000000000000004" como el resultado
		 * más acertado posible.
		 */
		assertEquals(0.30000000000000004, pantano.calcularProporcionDeTierra());
	}
	
	@Test
	void testIsEquals() {
		assertTrue(pantano.isEquals(new Pantano()));
		assertFalse(pantano.isEquals(new Tierra()));
		assertFalse(pantano.isEquals(new Agua()));
	}

}
