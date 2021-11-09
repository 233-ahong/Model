package cn.factory.bll;

public abstract class Operation {
    protected int a, b;
    public void setValue(int a,int b){
        this.a=a;
        this.b=b;
    }
    public abstract int getResult();
}
