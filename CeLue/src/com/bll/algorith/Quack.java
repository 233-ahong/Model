package com.bll.algorith;

public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("嘎嘎！");
    }
}
