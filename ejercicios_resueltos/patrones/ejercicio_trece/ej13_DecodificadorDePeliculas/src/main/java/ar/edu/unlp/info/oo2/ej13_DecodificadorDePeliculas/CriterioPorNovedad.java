package ar.edu.unlp.info.oo2.ej13_DecodificadorDePeliculas;

import java.util.List;

public class CriterioPorNovedad extends CriterioDeSugerencia {

	@Override
	public List<Pelicula> aplicarCriterio(Decodificador deco) {
		return deco.getGrilla().stream()
				.sorted((peli2, peli1) -> Integer.compare(peli1.getAnioDeEstreno(), peli2.getAnioDeEstreno())).toList();
	}

}
