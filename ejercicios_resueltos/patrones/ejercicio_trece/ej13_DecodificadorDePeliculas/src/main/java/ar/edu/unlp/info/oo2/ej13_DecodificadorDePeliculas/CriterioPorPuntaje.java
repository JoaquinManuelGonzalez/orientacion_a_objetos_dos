package ar.edu.unlp.info.oo2.ej13_DecodificadorDePeliculas;

import java.util.Comparator;
import java.util.List;

public class CriterioPorPuntaje extends CriterioDeSugerencia {

	@Override
	public List<Pelicula> aplicarCriterio(Decodificador deco) {
		return deco.getGrilla().stream()
				.sorted(Comparator.comparing(Pelicula::getPuntaje).reversed().thenComparing(Pelicula::getAnioDeEstreno))
				.toList();
	}

}
