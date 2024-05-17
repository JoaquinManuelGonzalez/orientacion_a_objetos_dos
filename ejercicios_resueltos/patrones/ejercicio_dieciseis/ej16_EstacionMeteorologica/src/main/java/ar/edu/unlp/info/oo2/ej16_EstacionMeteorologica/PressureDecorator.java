package ar.edu.unlp.info.oo2.ej16_EstacionMeteorologica;

public class PressureDecorator extends WeatherDecorator {

	public PressureDecorator(WeatherData component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		return super.displayData() + "Presion atmosf: " + this.getPresion() + "; ";
	}
	
}
