package factory;
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

class SimplePizzaFactory {
    static Pizza createPizza(String type) {
        Pizza p = null;
        if(type.equals("Cheese")) {
            p = new CheesePizza();
        } else if(type.equals("Veggie")){
            p = new VeggiePizza();
        }
        return p;
    }
}

abstract class Pizza {
    void prepare(){
        System.out.println("preparing!");
    }
    void bake() {
        System.out.println("baking!");
    }
}

class CheesePizza extends Pizza{
    CheesePizza(){
        System.out.println("CheesePizza Made!");
    }
}

class VeggiePizza extends Pizza{
    VeggiePizza(){
        System.out.println("VeggiePizza Made!");
    }
}