

package kishkolaba8;

import bsuir.mycommand.Command;

public class GarageDoorCLoseCommand implements Command {
    private GarageDoor door;
    public GarageDoorCLoseCommand( GarageDoor door){
        this.door=door;
    }
    @Override
    public void execute() {
        door.close();
    }

    @Override
    public void undo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
