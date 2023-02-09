package behavioural.observerPattern.weather;

/**
 * FileName: Subject
 * author: gxs
 * Date: 2023/2/9  8:45
 */
public interface WeatherSubject {
    void registerObserver(WeatherObserver o);
    void removeObserver(WeatherObserver o);
    void notifyObserver();
}
