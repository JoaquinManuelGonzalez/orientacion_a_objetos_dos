package ar.edu.unlp.info.oo2.ej16_EstacionMeteorologica;

public class RadiationDecorator extends WeatherDecorator {

	public RadiationDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		return super.displayData() +  "Radiacion Solar: " + this.getRadiacionSolar() + "; ";
	}
	
}
