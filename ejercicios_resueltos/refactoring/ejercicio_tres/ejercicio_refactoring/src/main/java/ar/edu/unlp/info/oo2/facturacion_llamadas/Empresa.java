package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles(new EstrategiaUltimoNumeroLibre());

	public boolean agregarNumeroTelefono(String linea) {
		return this.getGestorNumeros().agregarNumeroTelefono(linea);
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}

	private void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public Cliente registrarClienteFisico(String dni, String nombre) {
		String numeroTelefono = this.obtenerNumeroLibre();
		Cliente cliente = new ClienteFisico(nombre, numeroTelefono, dni);
		this.agregarCliente(cliente);
		return cliente;
	}

	public Cliente registrarClienteJuridico(String cuit, String nombre) {
		String numeroTelefono = this.obtenerNumeroLibre();
		Cliente cliente = new ClienteJuridico(nombre, numeroTelefono, cuit);
		this.agregarCliente(cliente);
		return cliente;
	}

	public Llamada registrarLlamadaInternacional(Cliente origen, Cliente destino, int duracion) {
		return origen.registrarLlamadaInternacional(destino, duracion);
	}

	public Llamada registrarLlamadaNacional(Cliente origen, Cliente destino, int duracion) {
		return origen.registrarLlamadaNacional(destino, duracion);
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return cliente.calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeCliente(Cliente cliente) {
		return clientes.contains(cliente);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
