package ar.edu.unlp.info.oo2.ej11_AdministradorDeProyectos;

public class EstadoEnConstruccion extends Estado {

	public EstadoEnConstruccion(Proyecto proyecto) {
		super(proyecto);
	}
	
	/*
	 * El proyecto pasa a etapa “En evaluación“ siempre y
	 * cuando su precio no sea 0 (cero). De lo contrario
	 * genera un error.
	*/
	@Override
	public void aprobarEtapa() {
		if (!this.getProyecto().tienePrecioNulo()) {
			this.getProyecto().modificarEstado(new EstadoEnEvaluacion(this.getProyecto()));
		} else {
			throw new RuntimeException("El Proyecto tiene un precio de $0");
		}
	}

	/*
	 * Actualiza el margen de ganancia si se encuentra en
	 * los siguientes valores:
	 * Para “En construcción” -> valores entre 8% y 10%
 	 * Para valores fuera de los rangos permitidos no
	 * produce efecto alguno en el proyecto.
	*/
	@Override
	public boolean modificarMargenDeGanancia(double nuevoMargen) {
		return (nuevoMargen >= 0.08 && nuevoMargen <= 0.10);
	}

}
