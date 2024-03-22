package ar.edu.unlp.info.oo2.ej2_piedra_papel_o_tijera;

public interface Jugada {
	
	public String jugarContra(Jugada otraJugada);
	
	public String jugarContraPiedra();
	
	public String jugarContraPapel();
	
	public String jugarContraTijera();
	
	public String jugarContraLagarto();
	
	public String jugarContraSpock();
	
}
