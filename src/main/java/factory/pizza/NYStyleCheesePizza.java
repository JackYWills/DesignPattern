package factory.pizza;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 18:09
 * @Version V1.0
 **/
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(){
        System.out.println("NY Style CheesePizza Made!");
    }

    @Override
    public void prepare() {
        System.out.println("Prepare:Freeze 10g NY Cheese!");
    }
}
