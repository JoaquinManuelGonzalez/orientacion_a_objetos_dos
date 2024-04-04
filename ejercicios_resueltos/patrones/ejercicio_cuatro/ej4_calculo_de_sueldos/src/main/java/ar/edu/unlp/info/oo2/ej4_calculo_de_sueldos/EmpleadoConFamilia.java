package ar.edu.unlp.info.oo2.ej4_calculo_de_sueldos;

public abstract class EmpleadoConFamilia extends Empleado {
	
	private boolean estaCasado;
	private int cantidadDeHijos;
	
	public EmpleadoConFamilia(boolean estaCasado, int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
		this.estaCasado = estaCasado;
	}
	
	public boolean getEstaCasado() {
		return estaCasado;
	}
	
	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}
	
	public double calcularAdicionalCasado() {
		double adicionalCasado = 0;
		if (this.getEstaCasado()) {
			adicionalCasado = 5000;
		}
		return adicionalCasado;
	}
	
	public double calcularAdicionalHijos(double adicionalPorHijo) {
		return adicionalPorHijo * this.getCantidadDeHijos();
	}

	
}
