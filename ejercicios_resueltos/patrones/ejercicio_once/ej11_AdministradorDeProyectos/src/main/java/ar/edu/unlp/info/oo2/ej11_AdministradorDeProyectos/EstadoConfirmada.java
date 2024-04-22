package ar.edu.unlp.info.oo2.ej11_AdministradorDeProyectos;

public class EstadoConfirmada extends Estado {

	public EstadoConfirmada(Proyecto proyecto) {
		super(proyecto);
	}

	// No produce efecto alguno en el proyecto.
	@Override
	public void aprobarEtapa() {
		throw new RuntimeException("El Proyecto ya fue Confirmado, no se puede realizar la operacion");
	}

	// No produce efecto alguno en el proyecto.
	@Override
	public boolean modificarMargenDeGanancia(double nuevoMargen) {
		throw new RuntimeException("El Proyecto ya fue Confirmado, no se puede realizar la operacion");
	}

}
