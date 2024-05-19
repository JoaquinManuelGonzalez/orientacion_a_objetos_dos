package ar.edu.unlp.info.oo2.ej22_SubteWay;

public class ConstructorSangucheVegetariano extends ConstructorSanguche {

	@Override
	public void construirPan() {
		this.getResultado().addParte(new Parte("Pan con Semillas", 120));
	}

	@Override
	public void construirAderezo() {
		//Sin aderezo
	}

	@Override
	public void construirPrincipal() {
		this.getResultado().addParte(new Parte("Provoleta Grillada", 200));
	}

	@Override
	public void construirAdicional() {
		this.getResultado().addParte(new Parte("Berenjenas al Escabeche", 100));
	}

}
