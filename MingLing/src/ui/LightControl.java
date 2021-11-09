package ui;

public class LightControl implements ICommand{
    private Light light;

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void on() {
        light.turnLight(true);
    }

    @Override
    public void off() {
        light.turnLight(false);
    }
}
