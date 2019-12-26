package factory;

import factory.pizza.Pizza;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 19:35
 * @Version V1.0
 **/
public abstract class PizzaHub {
    Pizza orderPizza(String type){
        Pizza p = createPizza(type);
        p.prepare();
        p.bake();
        return p;
    }

    /**
     * 由子类负责对象实例化
     */
    abstract Pizza createPizza(String type);
}
