package factory_abstract.factory;

import factory_abstract.ingredient.*;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/27 18:37
 * @Version V1.0
 **/
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
