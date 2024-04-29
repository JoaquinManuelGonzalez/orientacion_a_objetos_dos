package ar.edu.unlp.info.oo2.ej13_DecodificadorDePeliculas;

import java.util.List;

public abstract class CriterioDeSugerencia {
	
	public List<Pelicula> obtenerSugerencias(Decodificador deco) {
		return this.aplicarCriterio(deco).stream()
				.filter(peli -> !deco.fueReproducida(peli))
				.limit(3)
				.toList();
	}
	
	public abstract List<Pelicula> aplicarCriterio(Decodificador deco);
}
