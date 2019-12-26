package factory;

import factory.pizza.NYStyleCheesePizza;
import factory.pizza.NYStyleVeggiePizza;
import factory.pizza.Pizza;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 18:30
 * @Version V1.0
 **/
public class NYPizzaHub extends PizzaHub {

    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if(type.equals("veggie")){
            return new NYStyleVeggiePizza();
        } else{
            return null;
        }
    }
}
