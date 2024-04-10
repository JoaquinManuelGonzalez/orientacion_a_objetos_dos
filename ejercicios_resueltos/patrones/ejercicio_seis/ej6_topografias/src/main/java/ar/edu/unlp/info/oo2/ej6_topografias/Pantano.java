package ar.edu.unlp.info.oo2.ej6_topografias;

public class Pantano extends Topografia {

	public Pantano() {
		
	}
	
	@Override
	public double calcularProporcionDeAgua() {
		return 0.7;
	}
	
	@Override
	public boolean isEquals(Agua agua) {
		return false;
	}

	@Override
	public boolean isEquals(Tierra tierra) {
		return false;
	}

	@Override
	public boolean isEquals(Pantano pantano) {
		return true;
	}
	
	@Override
	public boolean isEquals(Topografia otraTopografia) {
		return otraTopografia.isEquals(this);
	}
	
}
