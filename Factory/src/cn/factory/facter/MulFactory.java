package cn.factory.facter;

import cn.factory.bll.Mul;
import cn.factory.bll.Operation;

public class MulFactory implements Factory{
    @Override
    public Operation getOperation() {
        return new Mul();
    }
}
