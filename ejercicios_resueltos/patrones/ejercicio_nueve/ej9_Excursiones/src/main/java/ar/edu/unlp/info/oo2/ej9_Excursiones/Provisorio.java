package ar.edu.unlp.info.oo2.ej9_Excursiones;

public class Provisorio extends Estado {

	public Provisorio(Excursion excursion) {
		super(excursion);
	}

	@Override
	public String obtenerInformacion() {
		int cantidadFaltante = this.getExcursion().cantidadFaltanteDeInscriptosParaMinimo();
		String informacion = "Cantidad de usuarios faltantes para alcanzar el cupo minimo: " + cantidadFaltante;
		return this.getExcursion().obtenerInformacionBasica() + informacion;
	}

	@Override
	public void inscribir(Usuario unUsuario) {
		this.getExcursion().addInscriptos(unUsuario);
		if (!this.getExcursion().faltanInscriptosParaMinimo()) {
			this.getExcursion().cambiarEstado(new Definitivo(this.getExcursion()));
		}
	}

}
