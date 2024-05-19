package ar.edu.unlp.info.oo2.ej22_SubteWay;

public class ConstructorSangucheClasico extends ConstructorSanguche {

	@Override
	public void construirPan() {
		this.getResultado().addParte(new Parte("Pan Brioche", 100));
	}

	@Override
	public void construirAderezo() {
		this.getResultado().addParte(new Parte("Mayonesa", 20));
	}

	@Override
	public void construirPrincipal() {
		this.getResultado().addParte(new Parte("Carne de Ternera", 300));
	}

	@Override
	public void construirAdicional() {
		this.getResultado().addParte(new Parte("Tomate", 80));
	}

}
