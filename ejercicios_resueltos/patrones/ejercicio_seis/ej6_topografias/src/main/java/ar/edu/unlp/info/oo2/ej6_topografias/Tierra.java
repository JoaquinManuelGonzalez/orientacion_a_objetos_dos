package ar.edu.unlp.info.oo2.ej6_topografias;

public class Tierra extends Topografia {

	public Tierra() {
		
	}
	
	@Override
	public double calcularProporcionDeAgua() {
		return 0;
	}

	@Override
	public boolean isEquals(Agua agua) {
		return false;
	}

	@Override
	public boolean isEquals(Tierra tierra) {
		return true;
	}

	@Override
	public boolean isEquals(Pantano pantano) {
		return false;
	}
	
	@Override
	public boolean isEquals(Topografia otraTopografia) {
		return otraTopografia.isEquals(this);
	}
	
}
