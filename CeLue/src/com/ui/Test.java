package com.ui;

import com.bll.algorith.FlyNoWay;
import com.bll.algorith.QuackNoWay;
import com.bll.client.*;

public class Test {
    public static void main(String[] args) {
        //想买一个麻辣鸭
        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();
        duck = new MallardDuck(new FlyNoWay(), new QuackNoWay());
        duck.fly();
        duck.quack();
    }
}
