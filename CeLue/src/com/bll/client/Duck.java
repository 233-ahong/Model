package com.bll.client;


import com.bll.algorith.IFlyBehavior;
import com.bll.algorith.IQuackBehavior;

public abstract class Duck {

    protected IFlyBehavior flyBehavior;
    protected IQuackBehavior quackBehavior;

    public Duck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public abstract void fly();

    public abstract void quack();
}
