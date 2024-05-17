package ar.edu.unlp.info.oo2.ej16_EstacionMeteorologica;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation {

	private double temperature;
	private double pressure;
	private double radiation;
	private List<Double> temperatures;
	
	public HomeWeatherStation(double pressure, 
			double radiation, 
			double temperature) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.radiation = radiation;
		this.temperatures = new ArrayList<Double>();
	}

	public double getTemperatura() {
		return this.temperature;
	}

	public double getPresion() {
		return this.pressure;
	}

	public double getRadiacionSolar() {
		return this.radiation;
	}

	public List<Double> getTemperaturas() {
		return this.temperatures;
	}
	
	public void addTemperatura(double temperatura) {
		this.temperatures.add(temperatura);
	}

	public String displayData() {
		 return "Temperatura F: " + this.getTemperatura() +
				 "Presión atmosf: " + this.getPresion() +
				 "Radiación solar: " + this.getRadiacionSolar();
	}
	
}
