package ar.edu.unlp.info.oo2.ej4_calculo_de_sueldos;

public abstract class Empleado {

	public double sueldo() {
		double basico = this.calcularBasico();
		double adicional = this.calcularAdicional();
		double descuento = this.calcularDescuento(basico, adicional);
		return ((basico + adicional) - descuento);
	}
	
	public double calcularDescuento(double sueldoBasico, double sueldoAdicional) {
		return ((sueldoBasico * 0.13) + (sueldoAdicional * 0.5));
	}
	
	public abstract double calcularBasico();
	
	public abstract double calcularAdicional();
	
}
