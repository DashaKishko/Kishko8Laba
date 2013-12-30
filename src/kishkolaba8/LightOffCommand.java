

package kishkolaba8;

import bsuir.mycommand.Command;


public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
