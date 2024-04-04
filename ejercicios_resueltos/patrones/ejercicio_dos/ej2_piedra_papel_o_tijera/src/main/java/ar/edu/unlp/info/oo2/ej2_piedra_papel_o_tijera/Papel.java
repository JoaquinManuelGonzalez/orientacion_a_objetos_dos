package ar.edu.unlp.info.oo2.ej2_piedra_papel_o_tijera;

public class Papel implements Jugada {
	
	public Papel() {
		
	}

	@Override
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.jugarContraPapel();
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana Papel";
	}

	@Override
	public String jugarContraPapel() {
		return "Empate";
	}

	@Override
	public String jugarContraTijera() {
		return "Gana Tijera";
	}

	@Override
	public String jugarContraLagarto() {
		return "Gana Lagarto";
	}

	@Override
	public String jugarContraSpock() {
		return "Gana Papel";
	}

}
