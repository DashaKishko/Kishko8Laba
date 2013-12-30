

package kishkolaba8;

import bsuir.mycommand.Command;


public class TVOffCommand implements Command {
    TV tv;
    
    public TVOffCommand( TV tv){
        this.tv=tv;
    }
    @Override
    public void execute() {
        tv.off();
        
    }

    @Override
    public void undo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
