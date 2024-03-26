package ar.edu.unlp.info.oo2.ej4_calculo_de_sueldos;

public class EmpleadoTemporario extends EmpleadoConFamilia {

	private int cantidadDeHoras;
	
	public EmpleadoTemporario(int cantidadDeHoras, 
			boolean estaCasado, 
			int cantidadDeHijos) {
		super(estaCasado, cantidadDeHijos);
		this.cantidadDeHoras = cantidadDeHoras;
	}
	
	public int getCantidadDeHoras() {
		return cantidadDeHoras;
	}
	
	@Override
	public double calcularBasico() {
		double montoPorHora = 300;
		return 20000 + this.calcularBasicoPorHora(montoPorHora);
	}
	
	private double calcularBasicoPorHora(double montoPorHora) {
		return this.getCantidadDeHoras() * montoPorHora;
	}

	@Override
	public double calcularAdicional() {
		return this.calcularAdicionalCasado() + this.calcularAdicionalHijos(2000);
	}

}
