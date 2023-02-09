package behavioural.observerPattern.weather;

/**
 * FileName: StatisticsDisplay
 * author: gxs
 * Date: 2023/2/9  8:58
 */
public class StatisticsDisplay implements WeatherObserver {
    public StatisticsDisplay(WeatherSubject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update " + temp + " " + humidity + " " + pressure);
    }
}
