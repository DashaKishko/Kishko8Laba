
package kishkolaba8;

import bsuir.mycommand.Command;


public class CeilingFanOffCommand implements Command{
    CeiligFan ceilingFan;
    public CeilingFanOffCommand( CeiligFan fan){
        this.ceilingFan=fan;
    }
    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
