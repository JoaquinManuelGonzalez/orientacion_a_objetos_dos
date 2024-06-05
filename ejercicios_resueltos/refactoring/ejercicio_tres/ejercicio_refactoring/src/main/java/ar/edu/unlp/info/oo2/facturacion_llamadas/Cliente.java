package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {

	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombre;
	private String numeroTelefono;

	public Cliente(String nombre, String numeroTelefono) {
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	private void agregarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}

	public Llamada registrarLlamadaInternacional(Cliente destino, int duracion) {
		Llamada llamada = new LlamadaInternacional(this.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		this.agregarLlamada(llamada);
		return llamada;
	}

	public Llamada registrarLlamadaNacional(Cliente destino, int duracion) {
		Llamada llamada = new LlamadaNacional(this.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		this.agregarLlamada(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas() {
		return this.llamadas.stream()
		.mapToDouble(
			llamada -> llamada.calcularMontoLlamada()
			 - 
			this.aplicarDescuento(llamada.calcularMontoLlamada())
			).sum();
	}

	public abstract double getDescuento();

	public abstract void setDescuento(double descuento);

	public double aplicarDescuento(double monto) {
		return monto * this.getDescuento();
	}

}
