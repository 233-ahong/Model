package cn.factory.facter;

import cn.factory.bll.Operation;
import cn.factory.bll.Sub;

public class SubFactory implements Factory{
    @Override
    public Operation getOperation() {
        return new Sub();
    }
}
