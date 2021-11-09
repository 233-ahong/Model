package com.bll.client;

import com.bll.algorith.FlyNoWay;
import com.bll.algorith.IFlyBehavior;
import com.bll.algorith.IQuackBehavior;
import com.bll.algorith.Squack;

public class RubberDuck extends Duck {
    public RubberDuck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    public RubberDuck() {
        super(new FlyNoWay(), new Squack());
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }
}
