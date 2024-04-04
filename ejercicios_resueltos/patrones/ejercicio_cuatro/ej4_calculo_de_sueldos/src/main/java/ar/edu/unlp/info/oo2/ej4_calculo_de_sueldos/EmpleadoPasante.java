package ar.edu.unlp.info.oo2.ej4_calculo_de_sueldos;

public class EmpleadoPasante extends Empleado {
	
	private int cantidadDeExamenes;
	
	public EmpleadoPasante(int cantidadDeExamenes) {
		this.cantidadDeExamenes = cantidadDeExamenes;
	}

	public int getCantidadDeExamenes() {
		return cantidadDeExamenes;
	}
	
	@Override
	public double calcularBasico() {
		return 20000;
	}

	@Override
	public double calcularAdicional() {
		double montoPorExamen = 2000;
		return this.getCantidadDeExamenes() * montoPorExamen;
	}

}
