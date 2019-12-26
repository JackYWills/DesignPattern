package decorator;

import decorator.beverage.Beverage;
import decorator.beverage.Espresso;
import decorator.beverage.HouseBlend;
import decorator.condiment.Mocha;
import decorator.condiment.Whip;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 17:24
 * @Version V1.0
 **/
public class StarbuckCoffee {
    public static void main(String[] args) {
        Beverage b = new Espresso();
        System.out.println(b.getDescription()+" $"+b.cost());

        Beverage b1 = new HouseBlend();
        b1 = new Mocha(b1);
        b1 = new Whip(b1);
        System.out.println(b1.getDescription()+" $"+b1.cost());
    }
}
