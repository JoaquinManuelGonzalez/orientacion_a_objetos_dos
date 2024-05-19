package ar.edu.unlp.info.oo2.ej22_SubteWay;

import java.util.ArrayList;
import java.util.List;

public class Sanguche {
	
	private List<Parte> partes;

	public Sanguche() {
		this.partes = new ArrayList<Parte>();
	}
	
	public List<Parte> getPartes() {
		return partes;
	}

	public double getPrecio() {
		return this.getPartes().stream()
				.mapToDouble(parte -> parte.getPrecio())
				.sum();
	}
	
	public void addParte(Parte parte) {
		this.partes.add(parte);
	}
	
}
