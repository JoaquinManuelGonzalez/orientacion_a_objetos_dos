package ar.edu.unlp.info.oo2.ej22_SubteWay;

public class SubteWay {
	
	private ConstructorSanguche constructor;
	
	public SubteWay() {
		this.constructor = new ConstructorSangucheClasico();
	}
	
	public void setConstructor(ConstructorSanguche constructor) {
		this.constructor = constructor;
	}
	
	public ConstructorSanguche getConstructor() {
		return constructor;
	}

	public Sanguche construirSanguche() {
		this.getConstructor().reset();
		this.getConstructor().construirPan();
		this.getConstructor().construirAderezo();
		this.getConstructor().construirPrincipal();
		this.getConstructor().construirAdicional();
		return this.getConstructor().getResultado();
	}
	
}
