package behavioural.observerPattern.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: WeatherData
 * author: gxs
 * Date: 2023/2/9  8:53
 */
public class WeatherData implements WeatherSubject {

    private List<WeatherObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setMeasurements(float temperature,
    float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObserver();
    }
    @Override
    public void registerObserver(WeatherObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(WeatherObserver o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (WeatherObserver o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }
}
