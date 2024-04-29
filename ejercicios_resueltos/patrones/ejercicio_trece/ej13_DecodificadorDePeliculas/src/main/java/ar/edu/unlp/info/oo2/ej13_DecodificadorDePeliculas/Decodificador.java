package ar.edu.unlp.info.oo2.ej13_DecodificadorDePeliculas;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {


	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	private CriterioDeSugerencia criterio = new CriterioPorSimilitud();
	
	public Decodificador() {
		this.grilla = new ArrayList<Pelicula>();
		this.reproducidas = new ArrayList<Pelicula>();
	}

	public Decodificador(List<Pelicula> grilla) {
		this.grilla = grilla;
	}

	public Decodificador(List<Pelicula> grilla, 
			List<Pelicula> reproducidas) {
		this.grilla = grilla;
		this.reproducidas = reproducidas;
	}
	
	public List<Pelicula> getGrilla() {
		return grilla;
	}

	public List<Pelicula> getReproducidas() {
		return reproducidas;
	}

	public CriterioDeSugerencia getCriterio() {
		return criterio;
	}
	
	public void cambiarCriterioDeSugerencia(CriterioDeSugerencia nuevoCriterio) {
		this.criterio = nuevoCriterio;
	}
	
	public List<Pelicula> obtenerSugerencias() {
		return this.getCriterio().obtenerSugerencias(this);
	}

	public void addALaGrilla(Pelicula pelicula) {
		this.grilla.add(pelicula);
	}
	
	public void addAReproducidas(Pelicula pelicula) {
		this.reproducidas.add(pelicula);
	}
	
	public boolean fueReproducida(Pelicula pelicula) {
		return this.getReproducidas().contains(pelicula);
	}
	
}
