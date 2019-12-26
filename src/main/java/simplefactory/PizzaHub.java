package simplefactory;

import simplefactory.factory.SimplePizzaFactory;
import simplefactory.pizza.Pizza;

/**
 * @Author: yanwenjie
 * @Date2019/12/14 9:20
 * @Version V1.0
 **/
public class PizzaHub {

    SimplePizzaFactory factory;

    // PizzaHub创建时必须指定SimplePizzaFactory
    PizzaHub(SimplePizzaFactory f){
        this.factory =f;
    }

    Pizza orderPizza(String type){
        Pizza p = SimplePizzaFactory.createPizza(type);
        p.prepare();
        p.bake();
        return p;
    }

    public static void main(String[] args) {
        SimplePizzaFactory pf = new SimplePizzaFactory();
        PizzaHub ph = new PizzaHub(pf);
        ph.orderPizza("Cheese");
        ph.orderPizza("Veggie");
    }

}

