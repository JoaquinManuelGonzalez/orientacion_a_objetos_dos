package ar.edu.unlp.info.oo2.ej16_EstacionMeteorologica;

public class MinFarenheitDecorator extends WeatherDecorator {

	public MinFarenheitDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		double min = Math.round(this.getTemperaturas().stream()
				.mapToDouble(t -> t)
				.min()
				.orElse(0));
		return super.displayData() + "Minimo: " + min + "; ";
	}
	
}
