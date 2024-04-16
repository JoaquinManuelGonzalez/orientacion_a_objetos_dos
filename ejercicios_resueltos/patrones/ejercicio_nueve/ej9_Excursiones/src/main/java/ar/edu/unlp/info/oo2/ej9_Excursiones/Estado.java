package ar.edu.unlp.info.oo2.ej9_Excursiones;

public abstract class Estado {
	
	private Excursion excursion;
	
	public Estado(Excursion excursion) {
		this.excursion = excursion;
	}
	
	public Excursion getExcursion() {
		return excursion;
	}
	
	public abstract String obtenerInformacion();
	
	public abstract void inscribir(Usuario unUsuario);

}
