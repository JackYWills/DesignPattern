package simplefactory.pizza;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 18:08
 * @Version V1.0
 **/
public abstract class Pizza {

    public void prepare(){
        System.out.println("preparing!");
    }

    public void bake() {
        System.out.println("baking!");
    }

}
