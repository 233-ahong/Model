package cn.factory.ui;

import cn.factory.bll.Operation;
import cn.factory.facter.*;

import java.util.Scanner;

public class View {
    private int a,b;
    private String operator;
    private Operation operation;
    private Factory factory;

    public int getResult(){
        return operation.getResult();
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        this.a = scanner.nextInt();
        this.b = scanner.nextInt();
        this.operator = scanner.next();
    }

    public View(int numberA, int numberB, String operator) {
        this.a = numberA;
        this.b = numberB;
        this.operator = operator;
        //使用简单工厂生产运算类对象
        this.NewOperation();
    }

    public void NewOperation() {
        if (operator != null) {
            switch (operator) {
                case "+":
                    factory = new AddFactory();
                    break;
                case "-":
                    factory = new SubFactory();
                    break;
                case "*":
                    factory=new MulFactory();
                    break;
                case "/":
                    factory=new DivFactory();
                    break;
            }
            operation = factory.getOperation();
        }

    }

    public View() {
        this.NewOperation();
    }

    public void upData(){
        System.out.println(this.getResult());
    }
}
