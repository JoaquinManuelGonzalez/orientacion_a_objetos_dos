package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaTest {

		Sistema twiter;

	@BeforeEach
	void setUp() throws Exception {
		twiter = new Sistema();
	}

	@Test
	void testCrearUsuario() {
		twiter.crearUsuario("Kelsier");
		twiter.crearUsuario("Sazed");
		twiter.crearUsuario("Kelsier");
		assertEquals(2, twiter.getUsuarios().size());
	}

}
