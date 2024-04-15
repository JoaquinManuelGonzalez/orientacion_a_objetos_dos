package ar.edu.unlp.info.oo2.ej7_FileSystem;

import java.util.List;

public class Archivo extends FileSystem {
	
	private int tamano;
	
	public Archivo(String nombre, int tamano) {
		super(nombre);
		this.tamano = tamano;
	}

	/**
	* Retorna el espacio total ocupado, incluyendo todo su contenido.
	*/
	@Override
	public int tamanoTotalOcupado() {
		return this.tamano;
	}

	/**
	* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
	* filesystem
	*/
	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	/**
	* Retorna el archivo con fecha de creación más reciente en cualquier nivel
	* del filesystem
	*/
	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}

	/**
	* Retorna el primer elemento con el nombre solicitado contenido en
	cualquier
	* nivel del filesystem
	*/
	@Override
	public FileSystem buscar(String nombre) {
		if (!this.equalsNombre(nombre)) {
			return null;
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
	}

	@Override
	public String listarContenido(String nombre) {
		return nombre + this.getNombre() + "\n";
	}

}
