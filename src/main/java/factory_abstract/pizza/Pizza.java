package factory_abstract.pizza;

import factory_abstract.ingredient.Cheese;
import factory_abstract.ingredient.Dough;
import factory_abstract.ingredient.Sauce;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 18:08
 * @Version V1.0
 **/
public abstract class Pizza {

    Dough dough;

    Sauce sauce;

    Cheese cheese;

    public void prepare(){
        System.out.println("preparing!");
    }

    public void bake() {
        System.out.println("baking!");
    }

}
