package ar.edu.unlp.info.oo2.ej2_piedra_papel_o_tijera;

public class Lagarto implements Jugada {
	
	public Lagarto() {
		
	}

	@Override
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.jugarContraLagarto();
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana Piedra";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana Lagarto";
	}

	@Override
	public String jugarContraTijera() {
		return "Gana Tijera";
	}

	@Override
	public String jugarContraLagarto() {
		return "Empate";
	}

	@Override
	public String jugarContraSpock() {
		return "Gana Lagarto";
	}

}
