package training.model;

import java.util.Date;

/**
 * This is the main entity of this project
 */
public class City {

    /**
     * official name of the city, used by the api as a query parameter
     */
    private String name;
    /**
     * specific point in time to get the forecasting
     */
    private Date datetime;
    /**
     * current weather of a given city
     */
    private String weather;

    /**
     * Constructor class with name and datetime
     * @param name is the name of the city
     * @param datetime is the date which we want to get its weather
     */
    public City(String name, Date datetime) {
        this.name = name;
        this.datetime = datetime;
    }

    /**
     * Constructor class without a date
     * @param name is the name of the city
     */

    public City(String name) {
        this.name = name;
    }

    /**
     * @return name of the city
     */

    public String getName() {
        return name;
    }

    /**
     * @param name name to set
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the date we provided, or the current one
     */

    public Date getDatetime() {
        return datetime;
    }

    /**
     * @param datetime date to set
     */

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    /**
     * @return weather forecasting (light clouds, heavy clouds...)
     */

    public String getWeather() {
        return weather;
    }

    /**
     * @param weather weather to set
     */

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
