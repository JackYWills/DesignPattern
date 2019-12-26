package observer.origin.observer;

import observer.origin.display.DisplayElement;
import observer.origin.subject.Subject;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 13:29
 * @Version V1.0
 **/
public class ForecastDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    // 创建时自动注册到Subject中
    public ForecastDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Forecast temperature:"+37+"F degree");
    }
}
