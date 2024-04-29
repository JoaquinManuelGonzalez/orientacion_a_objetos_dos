package ar.edu.unlp.info.oo2.ej13_DecodificadorDePeliculas;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	
	private String titulo;
	private int anioDeEstreno;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String titulo, 
			int anioDeEstreno, 
			double puntaje) {
		this.titulo = titulo;
		this.anioDeEstreno = anioDeEstreno;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}
	
	public String getTitulo() {
		return titulo;
	}

	public int getAnioDeEstreno() {
		return anioDeEstreno;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public List<Pelicula> getSimilares() {
		return similares;
	}
	
	public void addSimilar(Pelicula pelicula) {
		if(!this.yaEsSimilar(pelicula)) {
			this.similares.add(pelicula);
			pelicula.addSimilar(this);
		}
	}
	
	private boolean yaEsSimilar(Pelicula pelicula) {
		return this.getSimilares().contains(pelicula);
	}

}
