package observer.origin.subject;

import observer.origin.observer.Observer;

import java.util.ArrayList;

/**
 * @Title: DesignPattern
 * @ClassName: WeatherData
 * @Description:
 * @Author: yanwenjie
 * @Date2019/11/28 18:16
 * @Version V1.0
 **/
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i =observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for(int i=0;i<observers.size();i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    // 气象站提供的在温度改变时会被触发接口
    public void measurementsChanged(){
        notifyObservers();
    }

    // 模拟气象站触发measurementsChanged
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        measurementsChanged();
    }
}
