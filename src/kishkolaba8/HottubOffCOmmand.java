package kishkolaba8;
import bsuir.mycommand.Command;
public class HottubOffCOmmand implements Command{

    Hottub hottub;
    public HottubOffCOmmand(Hottub hottub){
        this.hottub=hottub;
    }
    @Override
    public void execute() {
       hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }
    
}
