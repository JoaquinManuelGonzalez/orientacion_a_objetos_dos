package ar.edu.unlp.info.oo2.ej16_EstacionMeteorologica;

public class AverageFarenheitDecorator extends WeatherDecorator {

	public AverageFarenheitDecorator(WeatherData component) {
		super(component);
	}

	public String displayData() {
		double average = Math.round(this.getTemperaturas().stream()
				.mapToDouble(t -> t)
				.average()
				.orElse(0));
		return super.displayData() + "Promedio: " + average + "; ";
	}
	
}
