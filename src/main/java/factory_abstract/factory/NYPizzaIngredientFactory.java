package factory_abstract.factory;

import factory_abstract.ingredient.*;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/27 19:11
 * @Version V1.0
 **/
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(),new Onion()};
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }

}
