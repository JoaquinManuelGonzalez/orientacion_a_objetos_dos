package ar.edu.unlp.info.oo2.ej6_topografias;

public class Agua extends Topografia {
	
	public Agua() {
		
	}

	@Override
	public double calcularProporcionDeAgua() {
		return 1;
	}

	@Override
	public boolean isEquals(Agua agua) {
		return true;
	}

	@Override
	public boolean isEquals(Tierra tierra) {
		return false;
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
