package ar.edu.unlp.info.oo2.ej6_topografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopografiaMixtaTest {
	
	Agua agua1;
	Agua agua2;
	Tierra tierra1;
	Tierra tierra2;
	Pantano pantano1;
	Pantano pantano2;
	TopografiaMixta mixtaAguaYTierra;
	TopografiaMixta mixtaSoloAguaTierraYMixta;
	TopografiaMixta mixtaPantanos;
	TopografiaMixta mixtaPantanosYMixta;
	
	@BeforeEach
	void setUp() throws Exception {
		agua1 = new Agua();
		tierra1 = new Tierra();
		agua2 = new Agua();
		tierra2 = new Tierra();
		pantano1 = new Pantano();
		pantano2 = new Pantano();
		mixtaAguaYTierra = new TopografiaMixta(agua1, tierra1, agua2, tierra2);
		mixtaSoloAguaTierraYMixta = new TopografiaMixta(agua1, tierra1, tierra2, mixtaAguaYTierra);
		mixtaPantanos = new TopografiaMixta(agua1, pantano1, tierra1, pantano2);
		mixtaPantanosYMixta = new TopografiaMixta(agua1, tierra1, tierra2, mixtaPantanos);
	}

	@Test
	void testProporcionDeAguaMixtaDeAguaYTierra() {
		assertEquals(0.5, mixtaAguaYTierra.calcularProporcionDeAgua());
	}
	
	@Test
	void testProporcionDeAguaMixtaDeAguaTierraYMixta() {
		assertEquals(0.375, mixtaSoloAguaTierraYMixta.calcularProporcionDeAgua());
	}
	
	@Test
	void testProporcionDeAguaMixtaDePantanos() {
		assertEquals(0.6, mixtaPantanos.calcularProporcionDeAgua());
	}
	
	@Test
	void testProporcionDeAguaMixtaDePantanosYMixta() {
		assertEquals(0.4, mixtaPantanosYMixta.calcularProporcionDeAgua());
	}

	@Test
	void testProporcionDeTierraMixtaDeAguaYTierra() {
		assertEquals(0.5, mixtaAguaYTierra.calcularProporcionDeTierra());
	}
	
	@Test
	void testProporcionDeTierraMixtaDeAguaTierraYMixta() {
		assertEquals(0.625, mixtaSoloAguaTierraYMixta.calcularProporcionDeTierra());
	}
	
	@Test
	void testProporcionDeTierraMixtaDePantanos() {
		assertEquals(0.4, mixtaPantanos.calcularProporcionDeTierra());
	}
	
	@Test
	void testProporcionDeTierraMixtaDePantanosYMixta() {
		assertEquals(0.6, mixtaPantanosYMixta.calcularProporcionDeTierra());
	}
	
	@Test
	void testIsEquals() {
		assertTrue(mixtaAguaYTierra.isEqual(mixtaAguaYTierra));
		assertFalse(mixtaAguaYTierra.isEqual(mixtaSoloAguaTierraYMixta));
		assertFalse(mixtaAguaYTierra.isEqual(mixtaPantanos));
		assertFalse(mixtaAguaYTierra.isEqual(mixtaPantanosYMixta));
	}
	
}
