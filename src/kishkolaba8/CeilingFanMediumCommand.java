
package kishkolaba8;

import bsuir.mycommand.Command;


public class CeilingFanMediumCommand implements Command{

    CeiligFan ceilingFan;
    int prevSpeed;
    
    public CeilingFanMediumCommand(CeiligFan ceilingFan){
        this.ceilingFan=ceilingFan;
    }
    @Override
    public void execute() {
        prevSpeed=ceilingFan.getSpeed();
        ceilingFan.medium();
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
