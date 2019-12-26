package strategy.kind;

import strategy.behavior.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        //flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("I'm a real mallard duck");
    }
}