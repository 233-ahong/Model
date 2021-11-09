package ui;

public class TVCommand implements ICommand{
    private TV tv;

    public void setTv(TV tv) {
        this.tv = tv;
    }

    @Override
    public void on() {
        tv.turnTV(true);
    }

    @Override
    public void off() {
        tv.turnTV(false);
    }
}
