package ar.edu.unlp.info.oo2.ej6_topografias;

public abstract class Topografia {

	public abstract double calcularProporcionDeAgua();
	
	public double calcularProporcionDeTierra() {
		return (1 - this.calcularProporcionDeAgua());
	}
	
	public abstract boolean isEquals(Agua agua);
	
	public abstract boolean isEquals(Tierra tierra);
	
	public abstract boolean isEquals(Pantano pantano);
	
	public boolean isEquals(TopografiaMixta mixta) {
		return false;
	}
	
	public abstract boolean isEquals(Topografia otraTopografia);
	
}
