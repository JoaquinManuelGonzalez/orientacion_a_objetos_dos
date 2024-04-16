package ar.edu.unlp.info.oo2.ej9_Excursiones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {

	private String nombre;
	private LocalDate fechaDeInicio;
	private LocalDate fechaDeFin;
	private String puntoDeEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private Estado estado = new Provisorio(this);
	private List<Usuario> inscriptos;
	private List<Usuario> enEspera;
	
	public Excursion(String nombre, 
			LocalDate fechaDeInicio, 
			LocalDate fechaDeFin, 
			String puntoDeEncuentro,
			double costo, 
			int cupoMinimo, 
			int cupoMaximo) {
		this.nombre = nombre;
		this.fechaDeInicio = fechaDeInicio;
		this.fechaDeFin = fechaDeFin;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.inscriptos = new ArrayList<Usuario>();
		this.enEspera = new ArrayList<Usuario>();
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFechaDeInicio() {
		return this.fechaDeInicio;
	}
	
	public LocalDate getFechaDeFin() {
		return this.fechaDeFin;
	}
	
	public String getPuntoDeEncuentro() {
		return this.puntoDeEncuentro;
	}
	
	public double getCosto() {
		return this.costo;
	}
	
	public int getCupoMinimo() {
		return this.cupoMinimo;
	}
	
	public int getCupoMaximo() {
		return this.cupoMaximo;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public List<Usuario> getInscriptos() {
		return inscriptos;
	}

	public List<Usuario> getEnEspera() {
		return enEspera;
	}
	
	public void cambiarEstado(Estado nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public void inscribir(Usuario unUsuario) {
		this.getEstado().inscribir(unUsuario);
	}
	
	public void addInscriptos(Usuario unUsuario) {
		this.getInscriptos().add(unUsuario);
	}
	
	public void addEnEspera(Usuario unUsuario) {
		this.getEnEspera().add(unUsuario);
	}
	
	public String obtenerInformacion() {
		return this.estado.obtenerInformacion();
	}
	
	public String obtenerInformacionBasica() {
		String informacion = "Nombre: " + this.getNombre() + "\n"
				+ "Costo: " + this.getCosto() + "\n"
				+ "Fecha de Inicio: " + this.getFechaDeInicio() + "\n"
				+ "Fecha de Fin: " + this.getFechaDeFin() + "\n"
				+ "Punto de Encuentro: " + this.getPuntoDeEncuentro() + "\n";
		return informacion;
	}
	
	public int cantidadFaltanteDeInscriptosParaMinimo() {
		int cantidadFaltante = 0;
		if (this.getCupoMinimo() > this.getInscriptos().size()) {
			cantidadFaltante = this.getCupoMinimo() - this.getInscriptos().size();
		}
		return cantidadFaltante;
	}
	
	public int cantidadFaltanteDeInscriptosParaMaximo() {
		int cantidadFaltante = 0;
		if (this.getCupoMaximo() > this.getInscriptos().size()) {
			cantidadFaltante = this.getCupoMaximo() - this.getInscriptos().size();
		}
		return cantidadFaltante;
	}
	
	public boolean faltanInscriptosParaMinimo() {
		return !(this.cantidadFaltanteDeInscriptosParaMinimo() == 0);
	}
	
	public boolean faltanInscriptosParaMaximo() {
		return !(this.cantidadFaltanteDeInscriptosParaMaximo() == 0);
	}
	
	public String mailsDeInscriptos() {
		StringBuilder mails = new StringBuilder();
		this.getInscriptos().stream()
		.forEach(usuario -> mails.append(usuario.getEmail()).append("\n"));
		String informacion = mails.toString();
		return informacion;
	}
	
}
