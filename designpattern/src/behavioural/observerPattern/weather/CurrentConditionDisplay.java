package behavioural.observerPattern.weather;

/**
 * FileName: CurrentConditionDisplay
 * author: gxs
 * Date: 2023/2/9  8:58
 */
public class CurrentConditionDisplay implements WeatherObserver {
    public CurrentConditionDisplay(WeatherSubject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrentConditionDisplay.update " + temp + " " + humidity + " " + pressure);
    }
}
