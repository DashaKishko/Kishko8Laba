
package kishkolaba8;

import bsuir.mycommand.Command;

public class CeilingFanOnCommand implements Command {
    CeiligFan ceilingFan;
    public CeilingFanOnCommand( CeiligFan fan){
        this.ceilingFan=fan;
    }
    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
