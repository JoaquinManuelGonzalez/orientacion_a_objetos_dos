package ar.edu.unlp.info.oo2.ej2_piedra_papel_o_tijera;

public class Spock implements Jugada {
	
	public Spock() {
		
	}

	@Override
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.jugarContraSpock();
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana Spock";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana Papel";
	}

	@Override
	public String jugarContraTijera() {
		return "Gana Spock";
	}

	@Override
	public String jugarContraLagarto() {
		return "Gana Lagarto";
	}

	@Override
	public String jugarContraSpock() {
		return "Empate";
	}

}
