package cn.factory.facter;

import cn.factory.bll.Add;
import cn.factory.bll.Operation;

public class AddFactory implements Factory{
    @Override
    public Operation getOperation() {
        return new Add();
    }
}
