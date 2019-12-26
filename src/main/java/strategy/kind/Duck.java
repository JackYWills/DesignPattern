package strategy.kind;

import strategy.behavior.FlyBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior; // 组合飞行行为，而非继承

    public Duck(){
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

}
