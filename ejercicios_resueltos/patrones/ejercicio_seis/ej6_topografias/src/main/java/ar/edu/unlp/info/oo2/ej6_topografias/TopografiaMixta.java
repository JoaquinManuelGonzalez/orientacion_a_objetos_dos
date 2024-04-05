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
	
	@Override
	public void addComponente(Topografia componente) {
		if (!this.isFull()) {
			this.componentes.add(componente);
		}
	}
	
	@Override
	public void removeComponente(Topografia componente) {
		this.componentes.remove(componente);
	}
	
	@Override
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
	public boolean isEqual(Topografia otraTopografia) {
		return this.getComponentes().equals(otraTopografia.getComponentes());
	}
	
}