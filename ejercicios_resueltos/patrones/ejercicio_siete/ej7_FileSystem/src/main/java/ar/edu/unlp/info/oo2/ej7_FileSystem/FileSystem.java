package ar.edu.unlp.info.oo2.ej7_FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class FileSystem {
	
	private String nombre;
	private LocalDate fechaDeCreacion;
	
	public FileSystem(String nombre) {
		this.nombre = "/" + nombre;
		this.fechaDeCreacion = LocalDate.now();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaDeCreacion() {
		return this.fechaDeCreacion;
	}
	
	/**
	* Retorna el espacio total ocupado, incluyendo todo su contenido.
	*/
	public abstract int tamanoTotalOcupado();
	
	/**
	* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
	* filesystem
	*/
	public abstract Archivo archivoMasGrande();
	
	/**
	* Retorna el archivo con fecha de creación más reciente en cualquier nivel
	* del filesystem
	*/
	public abstract Archivo archivoMasNuevo();
	
	/**
	* Retorna el primer elemento con el nombre solicitado contenido en
	cualquier
	* nivel del filesystem
	*/
	public abstract FileSystem buscar(String nombre);
	
	public boolean equalsNombre(String nombre) {
		return (this.getNombre().substring(1).equals(nombre));
	}
	
	/**
	* Retorna la lista con los elementos que coinciden con el nombre solicitado
	* contenido en cualquier nivel del filesystem
	*/
	public List<FileSystem> buscarTodos(String nombre) {
		List<FileSystem> elementos = new ArrayList<FileSystem>();
		this.buscarTodos(nombre, elementos);
		return elementos;
	}
	
	public abstract void buscarTodos(String nombre, List<FileSystem> elementos);
	
	public abstract String listarContenido(String nombre);
	
}
