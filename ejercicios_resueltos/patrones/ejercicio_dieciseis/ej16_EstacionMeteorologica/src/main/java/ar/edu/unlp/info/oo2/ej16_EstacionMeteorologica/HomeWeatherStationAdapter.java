package ar.edu.unlp.info.oo2.ej16_EstacionMeteorologica;

import java.util.List;

public class HomeWeatherStationAdapter implements WeatherData {

	private HomeWeatherStation weatherStation;
	
	public HomeWeatherStationAdapter(HomeWeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}

	public HomeWeatherStation getWeatherStation() {
		return weatherStation;
	}

	@Override
	public double getTemperatura() {
		return this.getWeatherStation().getTemperatura();
	}

	@Override
	public double getPresion() {
		return this.getWeatherStation().getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		return this.getWeatherStation().getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturas() {
		return this.getWeatherStation().getTemperaturas();
	}

	@Override
	public String displayData() {
		return "";
	}

}
