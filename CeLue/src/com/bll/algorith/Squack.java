package com.bll.algorith;

public class Squack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("发出橡皮与空气摩擦的声音！");
    }
}
