package factory_simple.factory;


import factory_simple.pizza.CheesePizza;
import factory_simple.pizza.Pizza;
import factory_simple.pizza.VeggiePizza;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 18:10
 * @Version V1.0
 **/
public class SimplePizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza p = null;
        if(type.equals("Cheese")) {
            p = new CheesePizza();
        } else if(type.equals("Veggie")){
            p = new VeggiePizza();
        }
        return p;
    }
}
