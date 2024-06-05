package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private EstrategiaNumeroLibre tipoGenerador;

	public GestorNumerosDisponibles(EstrategiaNumeroLibre tipoGenerador) {
		this.tipoGenerador = tipoGenerador;
	}

	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() {
		String linea = this.tipoGenerador.obtenerNumeroLibre(this.lineas);
		this.lineas.remove(linea);
		return linea;
	}

	public void cambiarTipoGenerador(EstrategiaNumeroLibre tipoGenerador) {
		this.tipoGenerador = tipoGenerador;
	}

	private boolean encontreNumeroTelefono(String linea) {
		return this.getLineas().contains(linea);
	}

	public boolean agregarNumeroTelefono(String linea) {
		if (!this.encontreNumeroTelefono(linea)) {
			this.getLineas().add(linea);
			return this.encontreNumeroTelefono(linea);
		}
		else {
			return this.encontreNumeroTelefono(linea);
		}
	}

}
