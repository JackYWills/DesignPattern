package factory_abstract.pizza;

import factory_abstract.factory.PizzaIngredientFactory;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 18:09
 * @Version V1.0
 **/
public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
        System.out.println("CheesePizza Made!");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing CheesePizza!");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
