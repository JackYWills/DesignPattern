package decorator.condiment;

import decorator.beverage.Beverage;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 17:28
 * @Version V1.0
 **/
public class Whip extends CondimentDecorator {

    /** 被装饰者 **/
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }

    @Override
    public double cost(){
        return .10 + beverage.cost();
    }
}
