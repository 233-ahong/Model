package web;

import bll.*;

public class FanRen {
    public static void main(String[] args) {
        LT lt=new LuoTi();
        CKZ ck=new CK();
        CKZ dk=new DK();
        ck.setLouti(dk);
        dk.setLouti(lt);
        ck.cKZ();
    }

}
