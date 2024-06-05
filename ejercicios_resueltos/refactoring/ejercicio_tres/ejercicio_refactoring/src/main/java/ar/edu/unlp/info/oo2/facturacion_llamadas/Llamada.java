package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private String origen;
	private String destino;
	private int duracion;

	public Llamada(String origen, String destino, int duracion) {
		this.origen= origen;
		this.destino= destino;
		this.duracion = duracion;
	}

	public String getDestino() {
		return destino;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public String getOrigen() {
		return origen;
	}

	public abstract double obtenerPrecioLlamada();

	public abstract double aplicarAdicional();

	public double obtenerIVA() {
		return this.obtenerPrecioLlamada() * 0.21;
	}

	public double calcularMontoLlamada() {
		return this.obtenerPrecioLlamada() + this.obtenerIVA() + this.aplicarAdicional();
	}

}
