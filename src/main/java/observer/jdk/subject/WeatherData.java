package observer.jdk.subject;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @Description:
 * @Author: yanwenjie
 * @Date2019/11/28 18:16
 * @Version V1.0
 **/
public class WeatherData extends Observable {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){ }

    // 气象站提供的在温度改变时会被触发接口
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    // 模拟气象站触发measurementsChanged
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        measurementsChanged();
    }

    // 供观察者拉取信息
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
