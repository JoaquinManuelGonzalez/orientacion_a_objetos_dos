package ar.edu.unlp.info.oo2.ej16_EstacionMeteorologica;

public class AverageCelsiusDecorator extends WeatherDecorator {
	
	public AverageCelsiusDecorator(WeatherData component) {
		super(component);
	}

	public String displayData() {
		double average = Math.round(this.getTemperaturas().stream()
				.mapToDouble(t -> ((t-32)/1.8))
				.average()
				.orElse(0));
		return super.displayData() + "Promedio: " + average + "; ";
	}
	
}
