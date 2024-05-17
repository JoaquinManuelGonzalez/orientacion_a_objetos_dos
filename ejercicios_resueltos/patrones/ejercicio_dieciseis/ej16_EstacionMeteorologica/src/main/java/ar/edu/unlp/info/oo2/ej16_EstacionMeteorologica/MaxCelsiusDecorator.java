package ar.edu.unlp.info.oo2.ej16_EstacionMeteorologica;

public class MaxCelsiusDecorator extends WeatherDecorator {
	
	public MaxCelsiusDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		double max = Math.round(this.getTemperaturas().stream()
				.mapToDouble(t -> ((t-32)/1.8))
				.max()
				.orElse(0));
		return super.displayData() + "Maximo: " + max + "; ";
	}
	
}
