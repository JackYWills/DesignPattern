package strategy.duck;

import strategy.kind.Duck;
import strategy.kind.MallardDuck;

/**
 * 策略模式：多用组合，少用继承；有一个比是一个更好
 */
public class MiniDuckSimulator {

    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly(); // 委托给Duck.java的flyBehavior对象
    }
}
