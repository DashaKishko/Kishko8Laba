

package kishkolaba8;

import bsuir.mycommand.Command;


public class TVOnCommand implements Command{
    TV tv;
    public TVOnCommand( TV tv){
        this.tv=tv;
    }
    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
         tv.off();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
