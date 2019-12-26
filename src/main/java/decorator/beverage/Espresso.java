package decorator.beverage;

/**
 * @Description: 浓缩咖啡
 * @Author: JackYan
 * @Date2019/12/26 16:49
 * @Version V1.0
 **/
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
