package decorator.beverage;

/**
 * @Description: 家庭混合（黑咖啡）
 * @Author: JackYan
 * @Date2019/12/26 16:55
 * @Version V1.0
 **/
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
