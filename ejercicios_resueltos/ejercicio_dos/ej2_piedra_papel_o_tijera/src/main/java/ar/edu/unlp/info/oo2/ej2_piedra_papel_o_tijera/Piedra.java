package ar.edu.unlp.info.oo2.ej2_piedra_papel_o_tijera;

public class Piedra implements Jugada {
	
	public Piedra() {
		
	}

	@Override
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.jugarContraPiedra();
	}

	@Override
	public String jugarContraPiedra() {
		return "Empate";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana Papel";
	}

	@Override
	public String jugarContraTijera() {
		return "Gana Tijera";
	}

	@Override
	public String jugarContraLagarto() {
		return "Gana Piedra";
	}

	@Override
	public String jugarContraSpock() {
		return "Gana Spock";
	}

}
