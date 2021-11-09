package ui;

import java.util.ArrayList;
import java.util.List;

public class Control {
    private List<ICommand> commands=new ArrayList<>();

    public void addControl(ICommand iCommand){
        this.commands.add(iCommand);
    }
    public void removeControl(ICommand iCommand){
        this.commands.remove(iCommand);
    }
    public void Button(int i){
        ICommand iCommand=this.commands.get(i);
        if (i%2 == 0) {
           iCommand.on();
        }else {
            iCommand.off();
        }
    }
}
