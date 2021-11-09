package cn.factory.facter;

import cn.factory.bll.Div;
import cn.factory.bll.Operation;

public class DivFactory implements Factory{
    @Override
    public Operation getOperation() {
        return new Div();
    }
}
