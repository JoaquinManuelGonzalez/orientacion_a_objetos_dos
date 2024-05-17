package ar.edu.unlp.info.oo2.ej16_EstacionMeteorologica;

public class MaxFarenheitDecorator extends WeatherDecorator {

	public MaxFarenheitDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		double max = Math.round(this.getTemperaturas().stream()
				.mapToDouble(t -> t)
				.max()
				.orElse(0));
		return super.displayData() + "Maximo: " + max + "; ";
	}
	
}
