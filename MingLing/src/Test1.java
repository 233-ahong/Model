import ui.Control;
import ui.Light;
import ui.LightControl;

public class Test1 {
    public static void main(String[] args) {
        Light light = new Light();
        LightControl controlL = new LightControl();
        controlL.setLight(light);
        Control control=new Control();
        control.addControl(controlL);
        control.addControl(controlL);
        control.Button(0);
        control.Button(1);
    }
}

