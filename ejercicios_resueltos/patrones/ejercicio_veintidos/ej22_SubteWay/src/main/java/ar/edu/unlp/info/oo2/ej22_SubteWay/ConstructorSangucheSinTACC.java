package ar.edu.unlp.info.oo2.ej22_SubteWay;

public class ConstructorSangucheSinTACC extends ConstructorSanguche {

	@Override
	public void construirPan() {
		this.getResultado().addParte(new Parte("Pan de Chipá", 150));
	}

	@Override
	public void construirAderezo() {
		this.getResultado().addParte(new Parte("Salsa Tártara", 18));
	}

	@Override
	public void construirPrincipal() {
		this.getResultado().addParte(new Parte("Carne de Pollo", 250));
	}

	@Override
	public void construirAdicional() {
		this.getResultado().addParte(new Parte("Verduras Grilladas", 200));
	}

}
