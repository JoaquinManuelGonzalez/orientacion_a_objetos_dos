package ar.edu.unlp.info.oo2.ej6_topografias;

import java.util.List;

public abstract class Topografia {

	public abstract double calcularProporcionDeAgua();
	
	public double calcularProporcionDeTierra() {
		return (1 - this.calcularProporcionDeAgua());
	}
	
	public void addComponente(Topografia componente) {
		throw new UnsupportedOperationException("Operación inválida.");
	}
	
	public void removeComponente(Topografia componente) {
		throw new UnsupportedOperationException("Operación inválida.");
	}
	
	public List<Topografia> getComponentes(){
		throw new UnsupportedOperationException("Operación inválida.");
	}
	
	public boolean isEqual(Topografia otraTopografia) {
		return (this.calcularProporcionDeAgua() == otraTopografia.calcularProporcionDeAgua());
	}
	
	@Override
	public boolean equals(Object objeto) {
		/*
		 * Se redifine este método para que la comparación con las
		 * topografías mixtas no se haga por identidad, es decir, por
		 * que los objetos tengan mismas referencias de memoria, queremos  
		 * que se haga por el criterio que se pide.
		 */
		return this.isEqual((Topografia)objeto);
	}
	
}
