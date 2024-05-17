package ar.edu.unlp.info.oo2.ej16_EstacionMeteorologica;

public class CelsiusDecorator extends WeatherDecorator {

	public CelsiusDecorator(WeatherData component) {
		super(component);
	}
	
	public String displayData() {
		return super.displayData() + "Temperatura C: " + ((this.getTemperatura()-32)/1.8) + "; ";
	}
	
}
