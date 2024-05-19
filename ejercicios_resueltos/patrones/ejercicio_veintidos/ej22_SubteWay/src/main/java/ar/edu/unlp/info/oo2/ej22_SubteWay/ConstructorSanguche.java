package ar.edu.unlp.info.oo2.ej22_SubteWay;

public abstract class ConstructorSanguche {
	
	private Sanguche sanguche;
	
	public abstract void construirPan();
	
	public abstract void construirAderezo();
	
	public abstract void construirPrincipal();
	
	public abstract void construirAdicional();
	
	public void reset() {
		this.sanguche = new Sanguche();
	}
	
	public Sanguche getResultado() {
		return this.sanguche;
	}
	
}
