package ar.edu.unlp.info.oo2.ej9_Excursiones;

public class Definitivo extends Estado {

	public Definitivo(Excursion excursion) {
		super(excursion);
	}

	@Override
	public String obtenerInformacion() {
		int cantidadFaltante = this.getExcursion().cantidadFaltanteDeInscriptosParaMaximo();
		String mails = this.getExcursion().mailsDeInscriptos();
		String informacion =  "Cantidad de usuarios faltantes para alcanzar el cupo maximo: " + cantidadFaltante + "\n"
		+  "Mails de los Usuarios Inscriptos: " + mails;
		return this.getExcursion().obtenerInformacionBasica() + informacion;	
	}

	@Override
	public void inscribir(Usuario unUsuario) {
		this.getExcursion().addInscriptos(unUsuario);
		if (!this.getExcursion().faltanInscriptosParaMaximo()) {
			this.getExcursion().cambiarEstado(new Completa(this.getExcursion()));
		}
	}

}
