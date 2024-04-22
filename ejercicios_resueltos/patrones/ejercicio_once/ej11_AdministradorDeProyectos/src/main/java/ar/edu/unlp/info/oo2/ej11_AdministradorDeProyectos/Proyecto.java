package ar.edu.unlp.info.oo2.ej11_AdministradorDeProyectos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	
	private String nombre;
	private LocalDate fechaDeInicio;
	private LocalDate fechaDeFin;
	private String objetivo;
	private int numeroDeIntegrantes;
	private double montoFijoPorDia;
	private double margenDeGanancia = 0.07;
	private Estado estado = new EstadoEnConstruccion(this);
	
	/*
	 * Se crea el proyecto en etapa “En construcción” con
	 * nombre, fecha de inicio y fin, objetivo, margen de
	 * ganancia de 7%, un número de integrantes y el monto
	 * de pago por integrante por día.
	 */
	public Proyecto(String nombre, 
			LocalDate fechaDeInicio, 
			LocalDate fechaDeFin, 
			String objetivo,
			int numeroDeIntegrantes, 
			double montoFijoPorDia) {
		this.nombre = nombre;
		this.fechaDeInicio = fechaDeInicio;
		this.fechaDeFin = fechaDeFin;
		this.objetivo = objetivo;
		this.numeroDeIntegrantes = numeroDeIntegrantes;
		this.montoFijoPorDia = montoFijoPorDia;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaDeInicio() {
		return fechaDeInicio;
	}
	
	public LocalDate getFechaDeFin() {
		return fechaDeFin;
	}
	
	public String getObjetivo() {
		return objetivo;
	}
	
	public int getNumeroDeIntegrantes() {
		return numeroDeIntegrantes;
	}
	
	public double getMontoFijoPorDia() {
		return montoFijoPorDia;
	}
	
	public double getMargenDeGanancia() {
		return margenDeGanancia;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void modificarEstado(Estado nuevaEtapa) {
		this.estado = nuevaEtapa;
	}
	
	public void modificarMargenDeGanancia(double margenDeGanancia) {
		if (this.getEstado().modificarMargenDeGanancia(margenDeGanancia)) {
			this.setMargenDeGanancia(margenDeGanancia);
		}
	}
	
	private void setMargenDeGanancia(double margenDeGanancia) {
		this.margenDeGanancia = margenDeGanancia;
	}
	
	public void modificarObjetivo(String nuevoObjetivo) {
		this.objetivo = nuevoObjetivo;
	}
	
	/*
	 * Retorna la suma de los costos de las personas
	 * involucradas. Considerar que las personas trabajan
	 * todos los días que dura el proyecto.
	 */
	public double costoDelProyecto() {
		double costosDeDiasTrabajados = this.calcularCostosDeDiasTrabajados();
		return this.getNumeroDeIntegrantes() * costosDeDiasTrabajados; 
	}
	
	private double calcularCostosDeDiasTrabajados() {
		long cantidadDeDias = ChronoUnit.DAYS.between(this.getFechaDeInicio(), this.getFechaDeFin());
		return this.getMontoFijoPorDia() * cantidadDeDias;
	}
	
	/*
	 * Retorna el valor obtenido luego de aplicar el margen
	 * de ganancia al costo del proyecto.
	 */
	public double precioDelProyecto() {
		return this.costoDelProyecto() + (this.costoDelProyecto() * this.getMargenDeGanancia());
	}

	public void aprobarEtapa() {
		this.getEstado().aprobarEtapa();
	}
	
	public boolean tienePrecioNulo() {
		return this.precioDelProyecto() == 0;
	}
	
	public void cancelarProyecto() {
		this.getEstado().cancelarProyecto();
	}
	
}
