package factory_abstract;

import factory_abstract.factory.NYPizzaIngredientFactory;
import factory_abstract.factory.PizzaIngredientFactory;
import factory_abstract.pizza.CheesePizza;
import factory_abstract.pizza.ClamPizza;
import factory_abstract.pizza.Pizza;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 18:30
 * @Version V1.0
 **/
public class NYPizzaHub extends PizzaHub {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory inf = new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            return new CheesePizza(inf);
        } else if(type.equals("clam")){
            return new ClamPizza(inf);
        } else{
            return null;
        }
    }
}
