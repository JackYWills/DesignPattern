package factory;

import factory.pizza.Pizza;

/**
 * @Author: yanwenjie
 * @Date2019/12/14 9:20
 * @Version V1.0
 **/
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaHub ph = new NYPizzaHub();
        ph.orderPizza("cheese");
        ph.orderPizza("veggie");
    }

}

