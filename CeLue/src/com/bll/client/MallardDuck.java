package com.bll.client;

import com.bll.algorith.*;

public class MallardDuck extends Duck {
    public MallardDuck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void fly() {
        this.flyBehavior.fly();
    }

    @Override
    public void quack() {
        this.quackBehavior.quack();
    }
}
