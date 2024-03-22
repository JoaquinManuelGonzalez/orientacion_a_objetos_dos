package ar.edu.unlp.info.oo2.ej2_piedra_papel_o_tijera;

public class Juego {
	
	public Juego() {
		
	}
	
	public String jugarPartido(Jugada jugada, Jugada otraJugada) {
		return jugada.jugarContra(otraJugada);
	}
	
}
