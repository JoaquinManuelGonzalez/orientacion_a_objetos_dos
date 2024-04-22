package ar.edu.unlp.info.oo2.ej11_AdministradorDeProyectos;

public abstract class Estado {
	
	private Proyecto proyecto;

	public Estado(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	public Proyecto getProyecto() {
		return this.proyecto;
	}
	
	public abstract void aprobarEtapa();
	
	public abstract boolean modificarMargenDeGanancia(double nuevoMargen);
	
	/*
	 * Agrega “(Cancelado) ” al objetivo del proyecto.
	 * Deja el proyecto cancelado.
	*/
	public void cancelarProyecto() {
		String nuevoObjetivo = this.getProyecto().getObjetivo() + " (Cancelado)";
		this.getProyecto().modificarObjetivo(nuevoObjetivo);
		this.getProyecto().modificarEstado(new EstadoCancelado(this.getProyecto()));
	}
	
}
