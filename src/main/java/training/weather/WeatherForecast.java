package training.weather;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;
import training.model.City;
import training.repository.Repository;

public class WeatherForecast {

	private static final Repository weatherRepository = new Repository();

	public String getCityWeather(City city) {
		if (city.getDatetime() == null) {
			city.setDatetime(new Date());
		}
		if (city.getDatetime().before(new Date(new Date().getTime() + (1000 * 60 * 60 * 24 * 6)))) {
			String weather_forecast = weatherRepository.getWeather(city);
			city.setWeather(weather_forecast);

		}
		return city.getWeather();
	}
}
