package ar.edu.unlp.info.oo2.ej11_AdministradorDeProyectos;

public class EstadoCancelado extends Estado {

	public EstadoCancelado(Proyecto proyecto) {
		super(proyecto);
	}

	// No produce efecto alguno en el proyecto.
	public void cancelarProyecto() {
		throw new RuntimeException("El Proyecto está cancelado, no se puede realizar la operacion");
	}

	// No produce efecto alguno en el proyecto.
	@Override
	public void aprobarEtapa() {
		throw new RuntimeException("El Proyecto está cancelado, no se puede realizar la operacion");
	}

	// No produce efecto alguno en el proyecto.
	@Override
	public boolean modificarMargenDeGanancia(double nuevoMargen) {
		throw new RuntimeException("El Proyecto ya fue Cancelado, no se puede realizar la operacion");
	}
	
}
