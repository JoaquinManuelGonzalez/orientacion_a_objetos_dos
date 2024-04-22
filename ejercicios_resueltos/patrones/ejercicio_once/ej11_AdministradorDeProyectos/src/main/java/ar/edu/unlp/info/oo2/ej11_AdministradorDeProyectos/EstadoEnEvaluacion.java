package ar.edu.unlp.info.oo2.ej11_AdministradorDeProyectos;

public class EstadoEnEvaluacion extends Estado {

	public EstadoEnEvaluacion(Proyecto proyecto) {
		super(proyecto);
	}

	/*
	 * El proyecto pasa a etapa “Confirmada”
	*/
	@Override
	public void aprobarEtapa() {
		this.getProyecto().modificarEstado(new EstadoConfirmada(this.getProyecto()));
	}

	/*
	 * Actualiza el margen de ganancia si se encuentra en
	 * los siguientes valores:
	 * Para “En evaluación” -> valores entre 11% y 15%
 	 * Para valores fuera de los rangos permitidos no
	 * produce efecto alguno en el proyecto.
	*/
	@Override
	public boolean modificarMargenDeGanancia(double nuevoMargen) {
		return (nuevoMargen >= 0.11 && nuevoMargen <= 0.15);
	}

}
