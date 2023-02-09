package behavioural.observerPattern.weather;

/**
 * FileName: Observer
 * author: gxs
 * Date: 2023/2/9  8:46
 */
public interface WeatherObserver {
    void update(float temp, float humidity, float pressure);
}
