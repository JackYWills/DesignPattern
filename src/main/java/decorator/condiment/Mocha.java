package decorator.condiment;

import decorator.beverage.Beverage;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 17:06
 * @Version V1.0
 **/
public class Mocha extends CondimentDecorator {

    /** 被装饰者 **/
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost(){
        return .20 + beverage.cost();
    }
}
