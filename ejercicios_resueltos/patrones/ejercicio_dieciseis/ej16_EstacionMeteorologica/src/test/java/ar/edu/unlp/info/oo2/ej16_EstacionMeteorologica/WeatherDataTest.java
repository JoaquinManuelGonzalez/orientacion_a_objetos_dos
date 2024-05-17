package ar.edu.unlp.info.oo2.ej16_EstacionMeteorologica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WeatherDataTest {

	private HomeWeatherStationAdapter adapter;
	
	
	@BeforeEach
	void setUp() throws Exception {
		HomeWeatherStation homeStation = new HomeWeatherStation(1008, 200, 86);
		homeStation.addTemperatura(80.6);
		homeStation.addTemperatura(89.6);
		homeStation.addTemperatura(87.8);
        this.adapter = new HomeWeatherStationAdapter(homeStation);
	}

	@Test
	void testDisplayData() {
		CelsiusDecorator c = new CelsiusDecorator(adapter);
	    PressureDecorator p = new PressureDecorator(c);
	    RadiationDecorator r = new RadiationDecorator(p);
	    AverageCelsiusDecorator a = new AverageCelsiusDecorator(r);
	    MinCelsiusDecorator m = new MinCelsiusDecorator(a);
	    MaxCelsiusDecorator x = new MaxCelsiusDecorator(m);

	    assertEquals("Temperatura C: 30.0; Presion atmosf: 1008.0; Radiacion Solar: 200.0; Promedio: 30.0; Minimo: 27.0; Maximo: 32.0; ", x.displayData());
	}

}
