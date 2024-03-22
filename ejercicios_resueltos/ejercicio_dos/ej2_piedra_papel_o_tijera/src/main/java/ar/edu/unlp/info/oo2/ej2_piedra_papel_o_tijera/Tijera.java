package ar.edu.unlp.info.oo2.ej2_piedra_papel_o_tijera;

public class Tijera implements Jugada {
	
	public Tijera() {
		
	}

	@Override
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.jugarContraTijera();
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana Piedra";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana Tijera";
	}

	@Override
	public String jugarContraTijera() {
		return "Empate";
	}

	@Override
	public String jugarContraLagarto() {
		return "Gana Tijera";
	}

	@Override
	public String jugarContraSpock() {
		return "Gana Spock";
	}

}
