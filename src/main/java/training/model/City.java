package training.model;

import java.util.Date;

/**
 * This is the main entity of this project
 */
public class City {

    private String name;
    private Date datetime;
    private String weather;

    /**
     * We will access the weather via API, so we can't set it manually
     * @param name is the name of the city
     * @param datetime is the date which we want to get its weather
     */
    public City(String name, Date datetime) {
        this.name = name;
        this.datetime = datetime;
    }

    // We don't need to provide the date with this constructor
    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
