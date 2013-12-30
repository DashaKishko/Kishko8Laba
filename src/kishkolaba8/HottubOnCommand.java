package kishkolaba8;
import bsuir.mycommand.Command;
public class HottubOnCommand implements Command{

    Hottub hottub;
    public HottubOnCommand( Hottub hottub){
        this.hottub=hottub;
    }
    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }
    
}
