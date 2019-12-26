package decorator.beverage;

/**
 * @Description: 装饰者模式
 * @Author: JackYan
 * @Date2019/12/26 16:45
 * @Version V1.0
 **/
public abstract class Beverage {

    String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}

