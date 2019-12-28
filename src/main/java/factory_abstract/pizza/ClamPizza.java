package factory_abstract.pizza;

import factory_abstract.factory.PizzaIngredientFactory;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 18:09
 * @Version V1.0
 **/
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
        System.out.println("ClamPizza Made!");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing ClamPizza!");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
