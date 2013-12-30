
package kishkolaba8;

import bsuir.mycommand.Command;


public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand( Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
         light.off();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
