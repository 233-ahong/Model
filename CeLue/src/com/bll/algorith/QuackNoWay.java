package com.bll.algorith;

public class QuackNoWay implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("不会发生！");
    }
}
