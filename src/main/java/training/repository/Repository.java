package training.repository;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import org.json.JSONArray;
import org.json.JSONObject;
import training.model.City;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * This class is used to interact with the API
 */

public class Repository {

    /**
     * these are some URLS that need to be static and final
     */
    private static final String QUERY_URL = "https://www.metaweather.com/api/location/search/?query=";
    private static final String LOCATION_URL = "https://www.metaweather.com/api/location/";

    /**
     * empty constructor
     */
    public Repository() {
    }

    /**
     * Method used to get the weather of a given city
     * @param city is an instance of the City.java class
     * @return returns a String, containing weather report
     */
    public String getWeather(City city) {

        // HTTP request
        HttpRequestFactory requestFactory = new NetHttpTransport().createRequestFactory();
        HttpRequest httpRequest = null;
        try {
            httpRequest = requestFactory.buildGetRequest(new GenericUrl(QUERY_URL + city.getName()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //GETTING A RESPONSE
        String response = null;
        try {
            assert httpRequest != null;
            response = httpRequest.execute().parseAsString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //SOME VARIABLES TO AVOID HARDCODING
        String woeid = "woeid";
        String weatherKey = "consolidated_weather";
        String datePattern = "yyyy-MM-dd";
        String applicableDate = "applicable_date";
        String weatherStateName = "weather_state_name";
        String weather_forecast = "";
        int index = 0;

        //GETTING A JSON
        assert response != null;
        JSONArray array = new JSONArray(response);
        String woe = array.getJSONObject(index).get(woeid).toString();
        requestFactory = new NetHttpTransport().createRequestFactory();
        try {
            httpRequest = requestFactory.buildGetRequest(new GenericUrl(LOCATION_URL + woe));
            response = httpRequest.execute().parseAsString();
            JSONArray results = new JSONObject(response).getJSONArray(weatherKey);
            for (int i = 0; i < results.length(); i++) {
                if (new SimpleDateFormat(datePattern).format(city.getDatetime())
                        .equals(results.getJSONObject(i).get(applicableDate).toString())) {
                   weather_forecast = results.getJSONObject(i).get(weatherStateName).toString();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weather_forecast;
    }
}


