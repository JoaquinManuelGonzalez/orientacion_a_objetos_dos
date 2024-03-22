package ar.edu.unlp.info.oo2.ej2_piedra_papel_o_tijera;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JuegoTest {
	
	Juego juego;

	@BeforeEach
	void setUp() throws Exception {
		juego = new Juego();
	}

	@Test
	void testPartidaGanada() {
		Jugada jugadaPapel = new Papel();
		Jugada jugadaLagarto = new Lagarto();
		assertEquals("Gana Lagarto", juego.jugarPartido(jugadaPapel, jugadaLagarto));
	}
	
	@Test
	void testPartidaEmpate() {
		Jugada jugadaSpock = new Spock();
		Jugada jugadaSpockDos = new Spock();
		assertEquals("Empate", juego.jugarPartido(jugadaSpock, jugadaSpockDos));
	}

}
