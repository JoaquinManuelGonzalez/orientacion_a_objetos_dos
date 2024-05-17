package ar.edu.unlp.info.oo2.ej16_EstacionMeteorologica;

import java.util.List;

public abstract class WeatherDecorator implements WeatherData {
	
	private WeatherData component;
	
	public WeatherDecorator(WeatherData component) {
		this.component = component;
	}

	@Override
	public double getTemperatura() {
		return this.getComponent().getTemperatura();
	}

	public WeatherData getComponent() {
		return component;
	}

	@Override
	public double getPresion() {
		return this.getComponent().getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		return this.getComponent().getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturas() {
		return this.getComponent().getTemperaturas();
	}

	@Override
	public String displayData() {
		return this.getComponent().displayData();
	}
	
}
