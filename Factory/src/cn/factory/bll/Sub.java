package cn.factory.bll;

public class Sub extends Operation{
    @Override
    public int getResult() {
        return super.a-super.b;
    }
}
