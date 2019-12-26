package observer.jdk;

import observer.jdk.observer.CurrentConditionsDisplay;
import observer.jdk.observer.ForecastDisplay;
import observer.jdk.observer.StatisticsDisplay;
import observer.jdk.subject.WeatherData;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 13:22
 * @Version V1.0
 **/
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay cd = new CurrentConditionsDisplay(wd);
        StatisticsDisplay sd = new StatisticsDisplay(wd);
        ForecastDisplay fd = new ForecastDisplay(wd);
        wd.setMeasurements(80,65,30.4f);
        wd.setMeasurements(82,70,31.2f);
        wd.setMeasurements(78,90,29.7f);
    }
}
