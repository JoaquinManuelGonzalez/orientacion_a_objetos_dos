package ar.edu.unlp.info.oo2.ej22_SubteWay;

public class ConstructorSangucheVegano extends ConstructorSanguche {

	@Override
	public void construirPan() {
		this.getResultado().addParte(new Parte("Pan Integral", 100));
	}

	@Override
	public void construirAderezo() {
		this.getResultado().addParte(new Parte("Salsa Criolla", 20));
	}

	@Override
	public void construirPrincipal() {
		this.getResultado().addParte(new Parte("Milanesa de Girgolas", 500));
	}

	@Override
	public void construirAdicional() {
		//Sin adicional
	}

}
