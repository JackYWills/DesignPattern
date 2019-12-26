package simplefactory.factory;


import simplefactory.pizza.CheesePizza;
import simplefactory.pizza.Pizza;
import simplefactory.pizza.VeggiePizza;

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
