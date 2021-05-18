package training.weather;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import org.junit.Test;
import training.model.City;

public class WeatherForecastTest {

	@Test
	public void model_test() {
		City madrid = new City("Madrid", new Date());
		WeatherForecast weatherForecast = new WeatherForecast();
		String forecast = weatherForecast.getCityWeather(madrid);
		madrid.setWeather(forecast);
		System.out.println(madrid.getWeather());
	}

}