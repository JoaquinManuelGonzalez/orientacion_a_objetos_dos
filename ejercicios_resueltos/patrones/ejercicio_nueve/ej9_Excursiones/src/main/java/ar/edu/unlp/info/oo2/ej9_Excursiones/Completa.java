package ar.edu.unlp.info.oo2.ej9_Excursiones;

public class Completa extends Estado {

	public Completa(Excursion excursion) {
		super(excursion);
	}

	@Override
	public String obtenerInformacion() {
		return this.getExcursion().obtenerInformacionBasica();
	}

	@Override
	public void inscribir(Usuario unUsuario) {
		this.getExcursion().addEnEspera(unUsuario);
	}

}
