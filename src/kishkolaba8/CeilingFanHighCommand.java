

package kishkolaba8;

import bsuir.mycommand.Command;

public class CeilingFanHighCommand implements Command{
    CeiligFan ceilingFan;
    int prevSpeed;
    
    public CeilingFanHighCommand(CeiligFan ceilingFan){
        this.ceilingFan=ceilingFan;
    }
    @Override
    public void execute() {
        prevSpeed=ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if(prevSpeed==CeiligFan.HIGH){
            ceilingFan.high();
        }else if(prevSpeed==CeiligFan.MEDIUM){
            ceilingFan.medium();
        }
        else if(prevSpeed==CeiligFan.LOW){
            ceilingFan.low();
        }
        else if(prevSpeed==CeiligFan.OFF){
            ceilingFan.OFF();
        }
    }
    
}
