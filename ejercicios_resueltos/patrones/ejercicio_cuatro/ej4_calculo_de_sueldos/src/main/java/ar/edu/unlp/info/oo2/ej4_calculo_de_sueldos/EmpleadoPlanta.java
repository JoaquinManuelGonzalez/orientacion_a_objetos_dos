package ar.edu.unlp.info.oo2.ej4_calculo_de_sueldos;

public class EmpleadoPlanta extends EmpleadoConFamilia {

	private Integer antiguedad;
	
	public EmpleadoPlanta(int antiguedad, 
			boolean estaCasado, 
			int cantidadDeHijos) {
		super(estaCasado, cantidadDeHijos);
		this.antiguedad = antiguedad;
	}
	
	public Integer getAntiguedad() {
		return antiguedad;
	}

	@Override
	public double calcularBasico() {
		return 50000;
	}

	@Override
	public double calcularAdicional() {
		return this.calcularAdicionalCasado() + 
				this.calcularAdicionalHijos(2000) + 
				this.calcularAdicionalPorAtiguedad(2000);
	}
	
	private double calcularAdicionalPorAtiguedad(double adicionalPorAntiguedad) {
		return adicionalPorAntiguedad * this.getAntiguedad();
	}

}
