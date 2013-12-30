
package kishkolaba8;

import bsuir.mycommand.Command;

public class GarageDoorOpenCommand implements Command{
    private GarageDoor door;
    public GarageDoorOpenCommand( GarageDoor door){
        this.door=door;
    }
    @Override
    public void execute() {
        door.open();
    }

    @Override
    public void undo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
