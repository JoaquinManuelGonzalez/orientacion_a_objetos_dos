package ar.edu.unlp.info.oo2.ej16_EstacionMeteorologica;

public class MinCelsiusDecorator extends WeatherDecorator {
	
	public MinCelsiusDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		double min = Math.round(this.getTemperaturas().stream()
				.mapToDouble(t -> ((t-32)/1.8))
				.min()
				.orElse(0));
		return super.displayData() + "Minimo: " + min + "; ";
	}
	
}
