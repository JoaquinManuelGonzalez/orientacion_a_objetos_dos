package ar.edu.unlp.info.oo2.ej6_topografias;

import java.util.ArrayList;
import java.util.List;

public class TopografiaMixta extends Topografia {
	
	private List<Topografia> componentes;
	
	public TopografiaMixta(Topografia primerComponente,
			Topografia segundoComponente,
			Topografia tercerComponente,
			Topografia cuartoComponente) {
		this.componentes = new ArrayList<Topografia>();
		this.addComponente(primerComponente);
		this.addComponente(segundoComponente);
		this.addComponente(tercerComponente);
		this.addComponente(cuartoComponente);
	}
	
	public void addComponente(Topografia componente) {
		if (!this.isFull()) {
			this.componentes.add(componente);
		}
	}
	
	public void removeComponente(Topografia componente) {
		this.componentes.remove(componente);
	}
	
	public List<Topografia> getComponentes(){
		return new ArrayList<Topografia>(this.componentes);
	}
	
	private boolean isFull() {
		return (this.getComponentes().size() == 4);
	}
	
	@Override
	public double calcularProporcionDeAgua() {
		double suma = this.getComponentes().stream().
				mapToDouble(componente -> componente.calcularProporcionDeAgua()).
				sum();
		return suma / this.getComponentes().size();
	}
	
	@Override
	public boolean isEquals(Agua agua) {
		return false;
	}

	@Override
	public boolean isEquals(Tierra tierra) {
		return false;
	}

	@Override
	public boolean isEquals(Pantano pantano) {
		return false;
	}
	
	@Override
	public boolean isEquals(TopografiaMixta mixta) {
		Topografia componente1;
		Topografia componente2;
		for (int i = 0; i < this.getComponentes().size(); i++) {
			componente1 = this.getComponentes().get(i);
			componente2 = mixta.getComponentes().get(i);
			if (!componente1.isEquals(componente2)) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public boolean isEquals(Topografia otraTopografia) {
		return otraTopografia.isEquals(this);
	}
	
}