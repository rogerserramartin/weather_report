package training.weather;
import java.util.Date;
import training.model.City;
import training.repository.Repository;


/**
 * This is the main class, used to get the weather forecast of a given city
 * @author: Roger Serra Martin
 * @date: 18/05/2021
 * @version: 1.0
 * @see "https://github.com/rogersm92/weather_report"
 */

public class WeatherForecast {

	/**
	 * I've created this object to create, at least, a bit of a design pattern
	 */
	private static final Repository weatherRepository = new Repository();

	/**
	 * This method sets a String variable (Weather) as the 3rd attribute of the city object
	 * @param city is an instance of the City class
	 * @return a String containing the forecast
	 */
	public String getCityWeather(City city) {
		if (city.getDatetime() == null) {
			city.setDatetime(new Date());
		}
		//6 days to milliseconds for future forecasting
		int sixDays = 1000 * 60 * 60 * 24 * 6;
		if (city.getDatetime().before(new Date(new Date().getTime() + sixDays))) {
			String weather_forecast = weatherRepository.getWeather(city);
			city.setWeather(weather_forecast);

		}
		return city.getWeather();
	}
}
