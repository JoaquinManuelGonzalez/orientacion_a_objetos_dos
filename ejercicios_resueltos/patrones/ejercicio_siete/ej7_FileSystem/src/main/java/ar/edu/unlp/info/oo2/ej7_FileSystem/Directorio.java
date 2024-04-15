package ar.edu.unlp.info.oo2.ej7_FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends FileSystem {
	
	private List<FileSystem> contenido;
	
	public Directorio(String nombre) {
		super(nombre);
		this.contenido = new ArrayList<FileSystem>();
	}

	/**
	* Retorna el espacio total ocupado, incluyendo todo su contenido.
	*/
	@Override
	public int tamanoTotalOcupado() {
		int tamanoContenido = this.getContenido().stream()
				.mapToInt(componente -> componente.tamanoTotalOcupado())
				.sum();
		return (tamanoContenido + 32);
	}

	/**
	* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
	* filesystem
	*/
	@Override
	public Archivo archivoMasGrande() {
		return this.getContenido().stream()
				.map(componente1 -> componente1.archivoMasGrande())
				.max((componente1, componente2) -> Integer.compare(componente1.tamanoTotalOcupado(), componente2.tamanoTotalOcupado()))
				.orElse(null);
	}

	/**
	* Retorna el archivo con fecha de creación más reciente en cualquier nivel
	* del filesystem
	*/
	@Override
	public Archivo archivoMasNuevo() {
		return this.getContenido().stream()
				.map(componente1 -> componente1.archivoMasNuevo())
				.max((componente2, componente3) -> componente2.getFechaDeCreacion().compareTo(componente3.getFechaDeCreacion()))
				.orElse(null);
	}

	/**
	* Retorna el primer elemento con el nombre solicitado contenido en cualquier
	* nivel del filesystem
	*/
	@Override
	public FileSystem buscar(String nombre) {
		if (!this.equalsNombre(nombre)) {
			return this.getContenido().stream()
					.filter(componente -> componente.buscar(nombre) != null)
					.findFirst().orElse(null);
		} else {
			return this;
		}
	}

	/**
	* Retorna la lista con los elementos que coinciden con el nombre solicitado
	* contenido en cualquier nivel del filesystem
	*/
	@Override
	public void buscarTodos(String nombre, List<FileSystem> elementos) {
		if (this.equalsNombre(nombre)) {
			elementos.add(this);
		}
		this.getContenido().stream().forEach(componente -> componente.buscarTodos(nombre, elementos));
	}
	
	/**
	* Retorna un String con los nombres de los elementos contenidos en todos los
	* niveles del filesystem. De cada elemento debe retornar el path completo
	* similar al comando pwd de linux siguiendo el modelo presentado a continuación
		/Directorio A
		/Directorio A/Directorio A.1
		/Directorio A/Directorio A.1/Directorio A.1.1
		/Directorio A/Directorio A.1/Directorio A.1.2
		/Directorio A/Directorio A.2
		/Directorio B
	*/
	public String listarContenido() {
		StringBuilder listado = new StringBuilder();
		listado.append(this.getNombre()).append("\n");
		this.getContenido().stream()
		.forEach(componente -> listado.append(componente.listarContenido(this.getNombre())));
		String resultado = listado.toString();
		return resultado;
	}
	
	@Override
	public String listarContenido(String nombre) {
		String pathActual = nombre + this.getNombre();
		StringBuilder listado = new StringBuilder();
		listado.append(pathActual).append("\n");
		this.getContenido().stream()
		.forEach(componente -> listado.append(componente.listarContenido(pathActual)));
		String resultado = listado.toString();
		return resultado;
	}
	
	public void addComponente(FileSystem componente) {
		this.contenido.add(componente);
	}
	
	public List<FileSystem> getContenido() {
		return new ArrayList<FileSystem>(this.contenido);
	}

}
