package ar.edu.unlp.info.oo2.ej16_EstacionMeteorologica;

public class TemperaturesDecorator extends WeatherDecorator{

	public TemperaturesDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		return super.displayData() + "Temperaturas: " + this.getTemperaturas().toString() + "; ";
	}
	
}
