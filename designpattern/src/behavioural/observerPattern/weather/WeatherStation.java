package behavioural.observerPattern.weather;

/**
 * FileName: WeatherStation
 * author: gxs
 * Date: 2023/2/9  8:59
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(0, 0, 1);
        weatherData.setMeasurements(1, 1, 2);
    }
}
