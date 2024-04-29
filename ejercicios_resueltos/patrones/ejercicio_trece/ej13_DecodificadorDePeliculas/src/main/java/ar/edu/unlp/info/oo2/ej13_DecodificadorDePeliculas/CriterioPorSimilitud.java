package ar.edu.unlp.info.oo2.ej13_DecodificadorDePeliculas;

import java.util.List;

public class CriterioPorSimilitud extends CriterioDeSugerencia {

	@Override
	public List<Pelicula> aplicarCriterio(Decodificador deco) {
		return deco.getReproducidas().stream()
				.flatMap(peli -> peli.getSimilares().stream())
				.distinct()
				.sorted((peli2, peli1) -> Integer.compare(peli1.getAnioDeEstreno(), peli2.getAnioDeEstreno()))
				.toList();
	}

}
