package bll;

public class CKZ implements LT{
    protected LT louti;

    public void setLouti(LT louti) {
        this.louti = louti;
    }

    @Override
    public void cKZ() {
        if (this.louti != null) {
            this.louti.cKZ();
        }
    }
}
