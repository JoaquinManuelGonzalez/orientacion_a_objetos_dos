package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {

	public LlamadaInternacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
	}

	@Override
	public double obtenerPrecioLlamada() {
		return this.getDuracion() * 150;
	}

	@Override
	public double aplicarAdicional() {
		return 0;
	}

}
