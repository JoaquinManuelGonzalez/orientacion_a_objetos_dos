package ar.edu.unlp.info.oo2.ej16_EstacionMeteorologica;

public class FarenheitDecorator extends WeatherDecorator {

	public FarenheitDecorator(WeatherData component) {
		super(component);
	}
	
	public String displayData() {
		return super.displayData() + "Temperatura F: " + this.getTemperatura() + "; ";
	}
	
}
