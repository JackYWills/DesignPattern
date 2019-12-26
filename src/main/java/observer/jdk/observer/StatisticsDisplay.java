package observer.jdk.observer;

import observer.jdk.display.DisplayElement;
import observer.jdk.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 13:24
 * @Version V1.0
 **/
public class StatisticsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    Observable observable;

    // 创建时自动注册到Subject中
    public StatisticsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData wd = (WeatherData) obs;
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();
            this.pressure = wd.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature="+temperature);
    }
}
