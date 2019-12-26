package decorator.condiment;

import decorator.beverage.Beverage;

/**
 * @Description: 调料（装饰器）
 * @Author: JackYan
 * @Date2019/12/26 16:46
 * @Version V1.0
 **/
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

}
